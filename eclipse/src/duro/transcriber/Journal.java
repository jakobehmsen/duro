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

	public Journal(Func0<T> rootFunc) throws IOException, ClassNotFoundException {
		boolean journalExisted = true;
		
		Path journalDirectoryPath = Paths.get(journalDirectory);
		if(!java.nio.file.Files.exists(journalDirectoryPath)) {
			java.nio.file.Files.createDirectory(journalDirectoryPath);
			journalExisted = false;
		}
		
		Path journalFilePath = Paths.get(journalDirectory + "/" + journalFile);
		if(!java.nio.file.Files.exists(journalFilePath)) {
			java.nio.file.Files.createFile(journalFilePath);
			journalExisted = false;
		}
		
		if(!journalExisted) {
			root = rootFunc.call();
		} else {
			ArrayList<Entry<T, C>> transactions = readJournal(journalDirectory + "/" + journalFile);
			replay(transactions);
		}
		
		journalLogger = Executors.newSingleThreadExecutor();
	}

	private static <T extends Player<C>, C> ArrayList<Entry<T, C>> readJournal(String journalPath) throws ClassNotFoundException, IOException {
		ArrayList<Entry<T, C>> transactions = new ArrayList<Entry<T, C>>();
		
		FileInputStream fileOutput = new FileInputStream(journalPath);
		BufferedInputStream bufferedOutput = new BufferedInputStream(fileOutput);
		
		try {
			while(bufferedOutput.available() != 0) {
				// Should be read in chunks
				ObjectInputStream objectOutput = new ObjectInputStream(bufferedOutput);
				@SuppressWarnings("unchecked")
				Entry<T, C> transaction = (Entry<T, C>)objectOutput.readObject();
					
				transactions.add(transaction);
			}
		} finally {
			bufferedOutput.close();
		}
		
		return transactions;
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
