package encapsulation.without;

public class Main {

	public static void main(String[] args) {
		Member[] members = new Member[3];
		members[0] = createMember("Amy", 20);
		members[1] = createMember("Bob", 25);
		members[2] = createMember("Cathay", 12);

		showMembersInfo(members, 3);
		System.out.println("----------------------");
		addAgeToMembers(members, 3);
		showMembersInfo(members, 3);
	}

	public static Member createMember(String name, Integer age) {
		Member member = new Member();
		member.name = name;
		member.age = age >= 18 ? age : -1;
		return member;
	}

	public static void showMembersInfo(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("Name: %s, Age: %d\n", members[i].name, members[i].age);
		}
	}

	public static void addAgeToMembers(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			if (members[i].age >= 0) {
				members[i].age++;
			}
		}
	}

}
