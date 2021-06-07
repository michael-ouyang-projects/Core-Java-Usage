package stream.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main<T, R> {

	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listA.add(i);
		}
		List<StringBuilder> returnA = listA.stream().filter(i -> {
			return i % 2 == 0;
		}).map(i -> {
			return String.format("string %d", i);
		}).map(s -> {
			return new StringBuilder(s).append("*");
		}).collect(Collectors.toList());
		System.out.println(returnA);

		MichaelList<Integer> listB = new MichaelList<>();
		for (int i = 0; i < 10; i++) {
			listB.add(i);
		}
		List<StringBuilder> returnB = listB.michaelStream().filter(i -> {
			return i % 2 == 0;
		}).map(i -> {
			return String.format("string %d", i);
		}).map(s -> {
			return new StringBuilder(s).append("*");
		}).collect();
		System.out.println(returnB);
	}

}
