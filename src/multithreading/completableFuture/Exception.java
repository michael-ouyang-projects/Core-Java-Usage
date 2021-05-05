package multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Exception {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		boolean isTrue = true;

		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			if (isTrue) {
				throw new RuntimeException();
			}
			return "SUCCESSFUL1";
		}).exceptionally(e -> {
			System.out.println("in exceptionally");
			return "ERROR1";
		});
		System.out.println(future1.get());

		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			if (isTrue) {
				throw new RuntimeException();
			}
			return "SUCCESSFUL2";
		}).handle((result, e) -> {
			System.out.println("in handle");
			if (e != null) {
				return "ERROR2";
			}
			return result;
		});
		System.out.println(future2.get());
	}

}
