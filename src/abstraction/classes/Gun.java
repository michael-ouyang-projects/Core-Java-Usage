package abstraction.classes;

public class Gun extends Weapon {

	public Gun(String name, int price, int power) {
		super(name, price, power);
	}

	@Override
	public void attack() {
		System.out.println("Shoot! " + this.power);
	}

}
