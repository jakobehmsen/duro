package duro.transcriber;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import duro.delegate.Func0;

public class Journal<T extends Player<C>, C> {
	private static class Entry<T extends Player<C>, C> implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// Probably, there should be some sort of identifier to identify the respective reference
		// to execute commands on.
		// For now, commands are simply executed on root
		
		public List<C> replayableCommands;

		public Entry(List<C> replayableCommands) {
			this.replayableCommands = replayableCommands;
		}
	}
	
	private static final String journalDirectory = "jnl";
	private static final String journalFileName = "log";
	private static final String journalFile = journalFileName + ".jnl";
	
	private T root;
	private ExecutorService journalLogger;

	public Journal(T root) throws IOException, ClassNotFoundException {
		this.root = root;
		journalLogger = Executors.newSingleThreadExecutor();
	}
	
	public T getRoot() {
		return root;
	}
	
	private static class JournalInfo<T extends Player<C>, C> {
		public final T root;
		public final ArrayList<Entry<T, C>> transactions;
		
		public JournalInfo(T root, ArrayList<Entry<T, C>> transactions) {
			this.root = root;
			this.transactions = transactions;
		}
	}
	
	public static <T extends Player<C>, C> Journal<T, C> read(String journalPath) throws ClassNotFoundException, IOException {
		JournalInfo<T, C> journalInfo = readJournal(journalPath + "/" + journalFile);
		
		Journal<T, C> journal = new Journal<T, C>(journalInfo.root);
		journal.replay(journalInfo.transactions);
		
		return journal;
	}
	
	public static <T extends Player<C>, C> void write(T root, String journalPath) throws IOException {
		FileOutputStream fileOutput = new FileOutputStream(journalDirectory + "/" + journalFile, true);
		BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
		ObjectOutputStream objectOutput = new ObjectOutputStream(bufferedOutput);
		
		objectOutput.writeObject(root);
		
		objectOutput.close();
	}

	@SuppressWarnings("unchecked")
	private static <T extends Player<C>, C> JournalInfo<T, C> readJournal(String journalPath) throws ClassNotFoundException, IOException {
		T root;
		ArrayList<Entry<T, C>> transactions = new ArrayList<Entry<T, C>>();
		
		FileInputStream fileOutput = new FileInputStream(journalPath);
		BufferedInputStream bufferedOutput = new BufferedInputStream(fileOutput);
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream rootObjectInput = new ObjectInputStream(bufferedOutput);
			root = (T)rootObjectInput.readObject();
			
			while(bufferedOutput.available() != 0) {
				// Should be read in chunks
				ObjectInputStream objectInput = new ObjectInputStream(bufferedOutput);
				@SuppressWarnings("unchecked")
				Entry<T, C> transaction = (Entry<T, C>)objectInput.readObject();
					
				transactions.add(transaction);
			}
		} finally {
			bufferedOutput.close();
		}
		
		return new JournalInfo<T, C>(root, transactions);
	}
	
	private void replay(ArrayList<Entry<T, C>> transactions) {
		for(Entry<T, C> entry: transactions) {
			T player = root;
			player.replay(entry.replayableCommands);
		}
	}
	
	public void log(/*Here should be the identifier, */ final List<C> commands) {
		journalLogger.execute(new Runnable() {
			@Override
			public void run() {
				try {
					FileOutputStream fileOutput = new FileOutputStream(journalDirectory + "/" + journalFile, true);
					BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
					ObjectOutputStream objectOutput = new ObjectOutputStream(bufferedOutput);
					
					objectOutput.writeObject(new Entry<T, C>(commands));
					
					objectOutput.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
