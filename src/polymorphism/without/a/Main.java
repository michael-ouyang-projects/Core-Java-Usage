package polymorphism.without.a;

public class Main {

	public static void main(String[] args) {
		Member[] members = new Member[3];
		members[0] = createMember("Amy", 20, false);
		members[1] = createMember("Bob", 25, false);
		members[2] = createMember("Cathay", 12, true);

		showMembersInfo(members, 3);
	}

	public static Member createMember(String name, Integer age, boolean isVip) {
		Member member = new Member();
		member.name = name;
		member.age = age;
		member.isVip = isVip;
		return member;
	}

	public static void showMembersInfo(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			if (members[i].isVip) {
				System.out.printf("Name: %s, Age: %d [VIP]\n", members[i].name, members[i].age);
			} else {
				System.out.printf("Name: %s, Age: %d\n", members[i].name, members[i].age);
			}
		}
	}

}
