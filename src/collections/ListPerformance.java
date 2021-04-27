package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {

	private static List<Integer> arrayList = new ArrayList<>();
	private static List<Integer> linkedList = new LinkedList<>();

	public static void main(String[] args) {
		insertAtTheEnd();
		System.out.println();
		deleteAtTheBeginning();
	}

	public static void insertAtTheEnd() {
		long startTimeArrayList = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
		System.out.println("ArrayList Add: " + (System.currentTimeMillis() - startTimeArrayList));

		long startTimeLinkedList = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i);
		}
		System.out.println("LinkedList Add: " + (System.currentTimeMillis() - startTimeLinkedList));
	}

	public static void deleteAtTheBeginning() {
		long startTimeArrayList = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arrayList.remove(0);
		}
		System.out.println("ArrayList Delete: " + (System.currentTimeMillis() - startTimeArrayList));

		long startTimeLinkedList = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linkedList.remove(0);
		}
		System.out.println("LinkedList Delete: " + (System.currentTimeMillis() - startTimeLinkedList));
	}

}
