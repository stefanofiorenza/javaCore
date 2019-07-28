package course.java.jse.threads.sun.jdk5.tut02.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutor {


	private static final int NUMBER_OF_THREDS = 10;

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_THREDS);
		for (int i = 0; i < 20; i++) {
			Runnable worker = new CountRunnable("Runnable" + i);
			executor.execute(worker);
		}
		
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {

		}
		System.out.println("Finished all threads");
	}
}
