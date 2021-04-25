package factoryPattern;

public class MemberFactory {

	public static Member createMember(String name, Integer age, boolean isVip) {
		if (isVip) {
			return new VipMember(name, age);
		} else {
			return new Member(name, age);
		}
	}

	public static Member createNormalMember(String name, Integer age) {
		return new Member(name, age);
	}

	public static Member createVipMember(String name, Integer age) {
		return new VipMember(name, age);
	}

}
