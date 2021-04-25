package factoryPattern;

public class VipMember extends Member {

	public VipMember(String name, Integer age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.printf("Name: %s, Age: %d [VIP]\n", this.name, this.age);
	}

}
