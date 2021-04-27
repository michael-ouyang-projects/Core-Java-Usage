package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("TEST");
		System.out.println(stringList.get(0) + "\n");

		Map<String, List<String>> map = new HashMap<>();
		map.put("1", new ArrayList<>(Arrays.asList("ONE", "TWO", "THREE")));
		System.out.println(map.get("1") + "\n");

		ClassDataA<Integer, String> classDataA = new ClassDataA<>(1);
		classDataA.addStudentName("Amy");
		classDataA.addStudentName("Bob");
		classDataA.addStudentName("Cathay");
		classDataA.showStudents();

		ClassDataB<Integer, String> classDataB = new ClassDataB<>(2);
		classDataB.addStudentName("Amy");
		classDataB.addStudentName("Bob");
		classDataB.addStudentName("Cathay");
		classDataB.showStudents();

		showCharData("Michael");
		showCharData(new StringBuffer("Johnson"));
	}

	public static <T extends CharSequence> void showCharData(T data) {
		System.out.println(data.subSequence(0, 5));
	}

}
