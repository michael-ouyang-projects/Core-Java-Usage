package tmp;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetRotation {

	public static void main(String[] args) {
		Set<Member> members = new TreeSet<>();
		members.add(new Member("John", 20));
		members.add(new Member("Amy", 30));
		members.add(new Member("Alice", 15));
		members.add(new Member("Bob", 25));
		members.add(new Member("Michael", 18));
		members.add(new Member("Jack", 35));
		members.add(new Member("Cathay", 5));

		members.add(new Member("Test1", 10));
		members.add(new Member("Test2", 13));
		members.add(new Member("Test3", 1));

		System.out.println("[Set]: " + members + "\n");
	}

}

class Member implements Comparable<Member> {

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

	@Override
	public int compareTo(Member o) {
		System.out.println(name + ", " + o.name);
		return age - o.age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals()");
		Member memberToCompareWith = (Member) obj;
		if (this.name.equals(memberToCompareWith.name) && this.age == memberToCompareWith.age) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		System.out.println("in hashCode(), " + (name.hashCode() + age));
		return name.hashCode() + age;
	}

}
