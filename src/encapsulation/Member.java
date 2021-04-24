package encapsulation;

public class Member {

	private String name;
	private Integer age;

	public Member(String name, Integer age) {
		this.name = name;
		setAge(age);
	}

	public void setAge(Integer age) {
		if (age >= 18) {
			this.age = age;
		} else {
			this.age = -1;
		}
	}

	public void showInfo() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}

	public void addAge() {
		if (this.age >= 0) {
			this.age++;
		}
	}

}
