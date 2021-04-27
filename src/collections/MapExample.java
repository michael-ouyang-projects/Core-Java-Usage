package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("ONE", "ONE");
		hashMap.put("ONE", "1");

		hashMap.put("TWO", "TWO");
		hashMap.put("TWO", "2");

		hashMap.put("THREE", "THREE");
		hashMap.put("THREE", "3");

		hashMap.put("FOUR", "FOUR");
		hashMap.put("FOUR", "4");

		System.out.println("HashMap: " + hashMap);
		System.out.println("TreeMap: " + new TreeMap<>(hashMap));

		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("ONE", "1");
		linkedHashMap.put("TWO", "2");
		linkedHashMap.put("THREE", "3");
		linkedHashMap.put("FOUR", "4");
		System.out.println("LinkedHashMap: " + linkedHashMap);
	}

}
