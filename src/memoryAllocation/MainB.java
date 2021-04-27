package memoryAllocation;

public class MainB {

	public static void main(String[] args) {
		Member member = new Member("Michael", 23);
		changeMemberName(member);
		changeMemberAge(member.getAge());
		member.showInfo();
	}

	public static void changeMemberName(Member member) {
		member.setName("Bob");
	}

	public static void changeMemberAge(int age) {
		age = 40;
	}

}
