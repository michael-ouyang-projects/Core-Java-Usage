package concurrency;

public class LockMain {

	public static void main(String[] args) {
		sameInstanceSynchronized();
//		differentInstanceSynchronized();
//		staticSynchronized();
//		mixSynchronized();
	}

	public static void sameInstanceSynchronized() {
		Lock lockA = new Lock();

		new Thread(() -> {
			lockA.instanceMethod("A1");
		}).start();

		lockA.instanceMethod("A2");
	}

	public static void differentInstanceSynchronized() {
		Lock lockA = new Lock();
		Lock lockB = new Lock();

		new Thread(() -> {
			lockA.instanceMethod("A");
		}).start();

		lockB.instanceMethod("B");
	}

	public static void staticSynchronized() {
		new Thread(() -> {
			Lock.staticMethod("A");
		}).start();

		Lock.staticMethod("B");
	}

	public static void mixSynchronized() {
		Lock lockA = new Lock();

		new Thread(() -> {
			lockA.instanceMethod("A");
		}).start();

		Lock.staticMethod("B");
	}

}
