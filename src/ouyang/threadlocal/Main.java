package ouyang.threadlocal;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Resource resource = new Resource();

        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Task(i, resource));
        }
    }

}
