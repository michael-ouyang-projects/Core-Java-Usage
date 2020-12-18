package ouyang.threadlocal;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runner(test, String.format("Name %d", i)));
        }
    }

}
