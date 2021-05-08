package completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainC {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Long time = System.currentTimeMillis();
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "ONE";
		});
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "TWO";
		});
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "THREE";
		});
		CompletableFuture<Void> futures = CompletableFuture.allOf(future1, future2, future3);
		futures.get();
		System.out.println(System.currentTimeMillis() - time);
		System.out.println(future1.get() + future2.get() + future3.get());

		String result = Stream.of(future1, future2, future3).map(CompletableFuture::join)
				.collect(Collectors.joining(","));
		System.out.println(result);

		List<String> results = futures.thenApply(values -> Stream.of(future1, future2, future3)
				.map(CompletableFuture::join).collect(Collectors.toList())).get();
		results.forEach(System.out::println);

		ForkJoinPool.commonPool().awaitQuiescence(5, TimeUnit.SECONDS);
	}

}
