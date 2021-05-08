package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MainA {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Manual Completion
		CompletableFuture<String> future = new CompletableFuture<>();
		future.complete("HELLO");
		System.out.println(future.get() + "\n");

		// Executing tasks in ForkJoinPool.commonPool
		CompletableFuture.runAsync(() -> {
			System.out.println(Thread.currentThread().getName() + "\n");
		});

		// Attaching Callable Methods
		// thenApply
		// (Need the result of the computation and want to return new value)
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			String result = "@ HI";
			System.out.println(result);
			return result;
		}).thenApply(result -> {
			return result + " thenApply\n";
		});
		System.out.println(future2.get());

		// thenAccept
		// (Need the result of the computation but don't want to return new value)
		CompletableFuture.supplyAsync(() -> {
			String result = "# HI";
			System.out.println(result);
			return result;
		}).thenAccept(result -> {
			System.out.println(result + " thenAccept\n");
		});

		// thenRun
		// (Neither need the value of the computation nor want to return new value)
		CompletableFuture.runAsync(() -> {
			System.out.println("Run");
		}).thenRun(() -> {
			System.out.println("After Run");
		});

		ForkJoinPool.commonPool().awaitQuiescence(5, TimeUnit.SECONDS);
	}

}
