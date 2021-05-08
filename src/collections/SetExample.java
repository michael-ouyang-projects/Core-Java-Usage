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
		System.out.println("LinkedHashSet From List: " + linkedHashSet + "\n");

		Set<Member> members = new HashSet<>();
		Member memberA = new Member("John", 20);
		Member memberB = new Member("John", 20);
		members.add(memberA);
		members.add(memberB);
		System.out.println("Members size: " + members.size() + "\n");
		System.out.println("equals: " + memberA.equals(memberB));
		System.out.println("=: " + (memberA == memberB));
	}

}

class Member {

	public String name;
	public Integer age;

	public Member(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("in equals()");
//		Member memberToCompareWith = (Member) obj;
//		if (this.name.equals(memberToCompareWith.name) && this.age == memberToCompareWith.age) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	@Override
//	public int hashCode() {
//		System.out.println("in hashCode(), " + (name.hashCode() + age));
//		return name.hashCode() + age;
//	}

}
