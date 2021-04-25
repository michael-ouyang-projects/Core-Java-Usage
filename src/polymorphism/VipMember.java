package polymorphism;

public class VipMember extends Member {

	private Integer discount;

	public VipMember(String name, Integer age, Integer discount) {
		super(name, age);
		this.discount = discount;
	}

	@Override
	public void showInfo() {
		System.out.printf("Name: %s, Age: %d, Discount: %d [VIP]\n", this.name, this.age, this.discount);
	}

}
