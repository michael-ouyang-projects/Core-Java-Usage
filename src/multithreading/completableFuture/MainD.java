package multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MainD {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Long time = System.currentTimeMillis();
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "THREE";
		});
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "ONE";
		});
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "TWO";
		});
		CompletableFuture<Object> future = CompletableFuture.anyOf(future1, future2, future3);
		future.get();
		System.out.println(System.currentTimeMillis() - time);
		System.out.println(future.get());

		ForkJoinPool.commonPool().awaitQuiescence(5, TimeUnit.SECONDS);
	}

}
