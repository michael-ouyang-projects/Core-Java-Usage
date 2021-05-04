package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		System.out.println(ForkJoinPool.getCommonPoolParallelism());

		CompletableFuture.supplyAsync(() -> {
			System.out.println("@A " + Thread.currentThread().getName());
			return "HI";
		}).thenAcceptAsync(result -> {
			System.out.println("@B " + Thread.currentThread().getName());
		}).thenAcceptAsync(result -> {
			System.out.println("@C " + Thread.currentThread().getName());
		});

		CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("#A " + Thread.currentThread().getName());
			return "HI";
		}).thenAcceptAsync(result -> {
			System.out.println("#B " + Thread.currentThread().getName());
		}).thenAcceptAsync(result -> {
			System.out.println("#C " + Thread.currentThread().getName());
		});
		ForkJoinPool.commonPool().awaitQuiescence(5, TimeUnit.SECONDS);
	}

}
