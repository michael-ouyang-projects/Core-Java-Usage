package encapsulation.without;

public class Main {

	public static void main(String[] args) {
		Member[] members = new Member[5];
		members[0] = new Member("Amy", 20);
		members[1] = new Member("Bob", 25);
		members[2] = new Member("Cathay", 30);
		members[3] = new Member("   ", 35);
		members[4] = new Member("Test", 12);

		showMembersInfo(members, 5);
		System.out.println("----------------------");
		addAgeToMembers(members, 5);
		showMembersInfo(members, 5);
	}

	public static void showMembersInfo(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("Name: %s, Age: %d\n", members[i].name, members[i].age);
		}
	}

	public static void addAgeToMembers(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			members[i].age++;
		}
	}

}
