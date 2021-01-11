package ouyang.threadPerformance;

import java.util.Date;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                doWork(0);
            }
        });
        t1.start();

        for (int i = 5; i < 10; i++) {
            doWork(0);
        }
        t1.join();

        System.out.println("Run Time: " + (new Date().getTime() - startDate.getTime()) / 1000);
    }

    public static void doWork(Integer j) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            j++;
        }
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            j--;
        }
    }

}
