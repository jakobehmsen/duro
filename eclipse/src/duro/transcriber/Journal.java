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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
	
//	private static final String journalDirectory = "";
	private static final String journalFileName = "log";
	private static final String journalFile = journalFileName + ".jnl";
	
	private String journalPath;
	private T root;
	private ExecutorService journalLogger;

	public Journal(String journalPath, T root) throws IOException, ClassNotFoundException {
		this.journalPath = journalPath;
		this.root = root;
		journalLogger = Executors.newSingleThreadExecutor();
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
		
		Journal<T, C> journal = new Journal<T, C>(journalPath, journalInfo.root);
		journal.replay(journalInfo.transactions);
		
		return journal;
	}
	
	public static <T extends Player<C>, C> void write(T root, String journalPath) throws IOException {
		if(!java.nio.file.Files.exists(Paths.get(journalPath)))
			java.nio.file.Files.createDirectory(Paths.get(journalPath));
		else {
			java.nio.file.Files.deleteIfExists(Paths.get(journalPath + "/" + journalFile));
		}
		
		FileOutputStream fileOutput = new FileOutputStream(journalPath + "/" + journalFile, true);
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
	
	public T getRoot() {
		return root;
	}
	
	public void log(/*Here should be the identifier/reference?, */ final List<C> commands) {
		journalLogger.execute(new Runnable() {
			@Override
			public void run() {
				try {
					FileOutputStream fileOutput = new FileOutputStream(journalPath + "/" + journalFile, true);
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

	public void close() {
		journalLogger.shutdown();
	}
}
