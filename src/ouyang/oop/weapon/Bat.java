package ouyang.oop.weapon;

// Inheritance
public class Bat extends Weapon {

    public Bat() {
        super(0, "bat", "brown", 5, WeaponStatus.NORMAL);
    }

    public Bat(int id, String name, String color, int power, WeaponStatus status) {
        super(id, name, color, power, status);
    }

    @Override
    public void attack() {
        System.out.println("Hit! Power: " + getPower());
    }
    
    

}
