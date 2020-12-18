package ouyang.oop;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("123");
        }).start();;
    }
    
//    public static class TestThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("123");
//        }
//    }

}
