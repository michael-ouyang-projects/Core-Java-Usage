package polymorphism;

public class Main {

	public static void main(String[] args) {
		Member[] members = new Member[3];
		members[0] = new Member("Amy", 20);
		members[1] = new Member("Bob", 25);
		members[2] = new VipMember("Cathay", 12, 100);

		showMembersInfo(members, 3);
	}

	public static void showMembersInfo(Member[] members, int size) {
		for (int i = 0; i < size; i++) {
			members[i].showInfo();
		}
	}

}
