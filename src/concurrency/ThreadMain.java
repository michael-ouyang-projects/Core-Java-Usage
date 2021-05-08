package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		singleThreadExecution();
//		multiThreadsExecution();
//		multiThreadsExecutionWithThreadPool();
	}

	public static void singleThreadExecution() {
		long time = System.currentTimeMillis();
		taskA();
		taskB();
		taskC();
		System.out.println(System.currentTimeMillis() - time);
	}

	public static void multiThreadsExecution() throws InterruptedException {
		long time = System.currentTimeMillis();

		Thread threadA = new Thread(() -> {
			taskA();
		});
		threadA.start();

		Thread threadB = new Thread(() -> {
			taskB();
		});
		threadB.start();

		Thread threadC = new Thread(() -> {
			taskC();
		});
		threadC.start();

		threadA.join();
		threadB.join();
		threadC.join();
		System.out.println(System.currentTimeMillis() - time);
	}

	public static void multiThreadsExecutionWithThreadPool() throws InterruptedException {
		long time = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(() -> {
			taskA();
		});
		executor.execute(() -> {
			taskB();
		});
		executor.execute(() -> {
			taskC();
		});
		executor.shutdown();
		executor.awaitTermination(30, TimeUnit.SECONDS);
		System.out.println(System.currentTimeMillis() - time);
	}

	public static void taskA() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task A Completed!");
	}

	public static void taskB() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task B Completed!");
	}

	public static void taskC() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task C Completed!");
	}

}
