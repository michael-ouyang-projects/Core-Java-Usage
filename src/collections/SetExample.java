package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1_ONE");

		list.add("2_TWO");
		list.add("2_TWO");

		list.add("3_THREE");
		list.add("3_THREE");
		list.add("3_THREE");

		System.out.println("List: " + list);

		Set<String> hashSet = new HashSet<>(list);
		System.out.println("HashSet From List: " + hashSet);

		Set<String> treeSet = new TreeSet<>(hashSet);
		System.out.println("TreeSet From HashSet: " + treeSet);

		Set<String> linkedHashSet = new LinkedHashSet<>(list);
		System.out.println("LinkedHashSet From List: " + linkedHashSet);
	}

}
