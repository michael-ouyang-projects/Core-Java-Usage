package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		listSortingExample();
		setSortingExample();
		mapSortingByKeyExample();
		mapSortingByValueExampleA();
		mapSortingByValueExampleB();
	}

	public static void listSortingExample() {
		List<Member> members = new ArrayList<>();
		members.add(new Member("Bob", 25));
		members.add(new Member("John", 20));
		members.sort((one, two) -> {
			return one.age - two.age;
//			return two.age - one.age;
		});
		System.out.println("[List]: " + members + "\n");
	}

	public static void setSortingExample() {
		Set<Member> members = new TreeSet<>((one, two) -> {
			return one.age - two.age;
//			return two.age - one.age;
		});
		members.add(new Member("Bob", 25));
		members.add(new Member("John", 20));
		System.out.println("[Set]: " + members + "\n");
	}

	public static void mapSortingByKeyExample() {
		Map<Integer, Member> members = new TreeMap<>((one, two) -> {
			return one - two;
//			return two - one;
		});
		members.put(1, new Member("Bob", 25));
		members.put(2, new Member("John", 20));
		System.out.println("[Map](By Key): " + members + "\n");
	}

	public static void mapSortingByValueExampleA() {
		Map<Integer, Member> members = new HashMap<>();
		members.put(1, new Member("Bob", 25));
		members.put(2, new Member("John", 20));
		System.out.println("[Map](Original): " + members);

		List<Entry<Integer, Member>> list = new ArrayList<>(members.entrySet());
		list.sort((one, two) -> {
			return one.getValue().age - two.getValue().age;
//			return two.getValue().age - one.getValue().age;
		});
		Map<Integer, Member> result = new LinkedHashMap<>();
		list.forEach(entry -> {
			result.put(entry.getKey(), entry.getValue());
		});
		System.out.println("[Map](By Value): " + result + "\n");
	}

	public static void mapSortingByValueExampleB() {
		Map<Integer, Member> members = new HashMap<>();
		members.put(1, new Member("Bob", 25));
		members.put(2, new Member("John", 20));
		System.out.println("[Map](Original): " + members);

		Map<Integer, Member> result = members.entrySet().stream().sorted((one, two) -> {
			return one.getValue().age - two.getValue().age;
//			return two.getValue().age - one.getValue().age;
		}).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (existing, replacement) -> replacement, LinkedHashMap::new));
		System.out.println("[Map](By Value): " + result + "\n");
	}

}

class Member {

	public String name;
	public Integer age;

	public Member(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, Age: %d", name, age);
	}

}