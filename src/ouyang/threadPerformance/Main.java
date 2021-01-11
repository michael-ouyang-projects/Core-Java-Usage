package ouyang.threadPerformance;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date startDate = new Date();
        for (int i = 0; i < 10; i++) {
            doWork(0);
        }
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
