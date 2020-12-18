package ouyang.threadlocal;

import java.util.Random;

public class Runner implements Runnable {

    private Test test;
    private String name;

    public Runner(Test test, String name) {
        this.test = test;
        this.name = name;
    }

    @Override
    public void run() {
        test.setValue(name);
        try {
            Random random = new Random();
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadLocal: " + test.getThreadLocalValue() + ", Testing: " + test.getValue());
    }

}
