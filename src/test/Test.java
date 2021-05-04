package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		CompletableFuture<String> future0 = CompletableFuture.supplyAsync(() -> "HELLO");
//		System.out.println(future0.get());
//
//		CompletableFuture<String> futureX = CompletableFuture.supplyAsync(() -> "HELLO").thenApply(value -> {
//			System.out.println(Thread.currentThread().getName() + " X");
//			return value + " Bob";
//		});
//		System.out.println(futureX.get());
//
//		CompletableFuture<CompletableFuture<String>> future1 = CompletableFuture.supplyAsync(() -> "HELLO")
//				.thenApply(value -> CompletableFuture.supplyAsync(() -> {
//										System.out.println(Thread.currentThread().getName() + " X");
//										return value + " Bob";
//									}));
//		System.out.println(future1.get().get());
//
//		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "HELLO")
//				.thenCompose(value -> CompletableFuture.supplyAsync(() -> {
//										  System.out.println(Thread.currentThread().getName() + " Y");
//									  	  return value + " Bob";
//									  }));
//		System.out.println(future2.get());

		Long time = System.currentTimeMillis();
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName() + " ONE");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "ONE";
		}).thenCombine(CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName() + " TWO");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return " TWO";
		}), (value1, value2) -> value1 + value2);
		System.out.println(future2.get());
		System.out.println(System.currentTimeMillis() - time);
	}

}
