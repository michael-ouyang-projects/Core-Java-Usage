package memoryAllocation;

public class Member {

	private String name;
	private Integer age;

	public Member(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
