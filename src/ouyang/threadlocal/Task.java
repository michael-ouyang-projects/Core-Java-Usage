package ouyang.threadlocal;

import java.util.Random;

public class Task implements Runnable {

    private Integer id;
    private Resource resource;
    private final static Random random = new Random();

    public Task(Integer id, Resource resource) {
        this.id = id;
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.setValue(id);
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadLocal: " + resource.getThreadLocalValue() + ", Non-ThreadLocal: " + resource.getValue());
    }

}
