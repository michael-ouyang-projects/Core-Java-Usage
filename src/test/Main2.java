package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main2 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			test();
		}
		ForkJoinPool.commonPool().awaitQuiescence(5, TimeUnit.SECONDS);
	}

	public static void test() {
		CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName() + ", " + ForkJoinPool.commonPool().getPoolSize());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "HI";
		});
	}

}
