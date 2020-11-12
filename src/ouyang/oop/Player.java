package ouyang.oop;

import java.util.ArrayList;
import java.util.List;

import ouyang.oop.weapon.Weapon;

public class Player {

    private Weapon weaponInHand;
    private List<Weapon> weaponsInPocket = new ArrayList<>();

    public void attack() {
        if (weaponInHand != null) {
            // Polymorphism
            weaponInHand.attack();
        } else {
            System.out.println("Beating by hand! Power: 2");
        }
    }

    // Encapsulation (function)
    public void switchWeapon(int index) {
        weaponInHand = weaponsInPocket.get(index - 1);
    }

    // Encapsulation (function)
    public void putWeaponToPocket(Weapon weapon) {
        weaponsInPocket.add(weapon);
    }

    public Weapon getWeaponInHand() {
        return weaponInHand;
    }

    public List<Weapon> getWeaponsInPocket() {
        return weaponsInPocket;
    }

}
