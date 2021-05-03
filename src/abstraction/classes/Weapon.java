package abstraction.classes;

public abstract class Weapon {

	private String name;
	private int price;
	protected int power;

	public Weapon(String name, int price, int power) {
		this.name = name;
		this.price = price;
		this.power = power;
	}

	public void showInfo() {
		System.out.printf("Name: %s, Price: %d\n", name, price);
	}

	public abstract void attack();

}
