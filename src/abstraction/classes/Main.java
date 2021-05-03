package abstraction.classes;

public class Main {

	public static void main(String[] args) {
		Weapon gun = new Gun("GunX", 100, 100);
		Weapon bat = new Bat("BatX", 10, 10);

		gun.showInfo();
		bat.showInfo();

		gun.attack();
		bat.attack();
	}

}
