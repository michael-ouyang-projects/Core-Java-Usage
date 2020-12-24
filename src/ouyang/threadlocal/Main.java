package ouyang.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();

        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Task(i, resource));
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }

}
