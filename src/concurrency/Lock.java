package concurrency;

public class Lock {

	public synchronized void instanceMethod(String name) {
		System.out.println("in instanceMethod() " + name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("out instanceMethod() " + name);
	}

	public static synchronized void staticMethod(String name) {
		System.out.println("in staticMethod() " + name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("out staticMethod() " + name);
	}

}
