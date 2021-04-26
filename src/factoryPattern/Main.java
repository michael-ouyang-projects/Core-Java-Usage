package factoryPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Member> members = insertMembers(new Scanner(System.in));
		System.out.println("-----------------------------------");
		showMembersInfo(members);
	}

	public static List<Member> insertMembers(Scanner scanner) {
		List<Member> members = new ArrayList<>();

		String isContinue = "Y";
		while ("Y".equals(isContinue)) {
			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Age: ");
			Integer age = Integer.parseInt(scanner.nextLine());

			System.out.print("VIP(Y/N): ");
			String isVip = scanner.nextLine();

			members.add(MemberFactory.createMember(name, age, "Y".equals(isVip)));

			System.out.print("Continue to create member? (Y/N) ");
			isContinue = scanner.nextLine();
		}

		return members;
	}

	public static void showMembersInfo(List<Member> members) {
		for (Member member : members) {
			member.showInfo();
		}
	}

}
