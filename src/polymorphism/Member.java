package polymorphism;

public class Member {

	protected String name;
	protected Integer age;

	public Member(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}

}
