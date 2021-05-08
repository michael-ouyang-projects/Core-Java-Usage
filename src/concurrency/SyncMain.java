package concurrency;

import java.util.HashMap;
import java.util.Map;

public class SyncMain {

	private static Map<String, Integer> usersData = new HashMap<>();

	public static void main(String[] args) throws InterruptedException {
		usersData.put("Amy", 1000);

		Thread threadA = new Thread(() -> {
			withdraw("Amy", 1000);
		});
		threadA.start();

		Thread.sleep(1000);
		System.out.println();
		withdraw("Amy", 1000);
	}

	public static void withdraw(String name, int amount) {
		int balance = usersData.get(name);
		System.out.println("balance before withdraw: " + balance);
		if (balance >= amount) {
			System.out.println("withdraw amount: " + amount);
			balance -= amount;
		} else {
			System.out.println("withdraw amount: " + balance);
			balance = 0;
		}
		System.out.println("balance after withdraw: " + balance);
		usersData.put(name, balance);
	}

}
