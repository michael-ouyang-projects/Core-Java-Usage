package polymorphism.without.b;

public class Main {

	public static void main(String[] args) {
		Member[] members = new Member[2];
		members[0] = createMember("Amy", 20);
		members[1] = createMember("Bob", 25);

		VipMember[] vipMembers = new VipMember[1];
		vipMembers[0] = createVipMember("Cathay", 12, 100);

		showMembersInfo(members, 2);
		showVipMembersInfo(vipMembers, 1);
	}

	public static Member createMember(String name, Integer age) {
		Member member = new Member();
		member.name = name;
		member.age = age;
		return member;
	}

	public static VipMember createVipMember(String name, Integer age, Integer discount) {
		VipMember vipMember = new VipMember();
		vipMember.name = name;
		vipMember.age = age;
		vipMember.discount = discount;
		return vipMember;
	}

	public static void showMembersInfo(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("Name: %s, Age: %d\n", members[i].name, members[i].age);
		}
	}

	public static void showVipMembersInfo(VipMember[] vipMember, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("Name: %s, Age: %d, Discount: %d [VIP]\n", vipMember[i].name, vipMember[i].age, vipMember[i].discount);
		}
	}

}
