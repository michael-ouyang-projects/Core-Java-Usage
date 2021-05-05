package multithreading.completableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MainB {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return "HELLO BOB";
//		});
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(future.get());

//		Long time = System.currentTimeMillis();
//		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return "HELLO";
//		}).thenApply(value -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return value + " BOB";
//		});
//		System.out.println(future.get());
//		System.out.println(System.currentTimeMillis() - time);

		// thenCompose
		// (A method of combining 2 dependent futures together)
//		Long time = System.currentTimeMillis();
//		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return "HELLO";
//		}).thenCompose(value -> CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return value + " BOB";
//		}));
//		System.out.println(future.get());
//		System.out.println(System.currentTimeMillis() - time);

		// thenCombine
		// (A method of combining 2 independent futures together)
//		Long time = System.currentTimeMillis();
//		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return "HELLO";
//		}).thenCombine(CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return " BOB";
//		}), (value1, value2) -> value1 + value2);
//		System.out.println(future.get());
//		System.out.println(System.currentTimeMillis() - time);

		// thenAcceptBoth
		// (A method of combining 2 independent futures without returning value)
//		Long time = System.currentTimeMillis();
//		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return "HELLO";
//		}).thenAcceptBoth(CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			return " BOB";
//		}), (value1, value2) -> {
//			System.out.println(value1 + value2);
//		});
//		future.get();
//		System.out.println(System.currentTimeMillis() - time);

		ForkJoinPool.commonPool().awaitQuiescence(5, TimeUnit.SECONDS);
	}

}
