package abstraction.classes;

public class Bat extends Weapon {

	public Bat(String name, int price, int power) {
		super(name, price, power);
	}

	@Override
	public void attack() {
		System.out.println("Hit! " + this.power);
	}

}
