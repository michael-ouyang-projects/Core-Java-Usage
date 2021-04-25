package factoryPattern.without;

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
		String isContinue = "Y";
		List<Member> members = new ArrayList<>();

		while ("Y".equals(isContinue)) {
			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Age: ");
			Integer age = Integer.parseInt(scanner.nextLine());

			System.out.print("VIP(Y/N): ");
			String isVip = scanner.nextLine();

			if ("Y".equals(isVip)) {
				members.add(new VipMember(name, age));
			} else {
				members.add(new Member(name, age));
			}

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
