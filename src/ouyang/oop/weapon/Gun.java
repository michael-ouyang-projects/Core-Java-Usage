package ouyang.oop.weapon;

// Inheritance
public class Gun extends Weapon {

    public Gun(int id, String name, String color, int power, WeaponStatus status) {
        super(id, name, color, power, status);
    }

    @Override
    public void attack() {
        System.out.println("Shoot! Power: " + getPower());
    }

}
