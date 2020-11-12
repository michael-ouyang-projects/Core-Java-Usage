package ouyang.oop.weapon;

public class WeaponStoreB implements WeaponStore {

    public void showWeaponsInStore() {
        System.out.println("1. Gun, 2. Bat");
    }

    public Weapon getWeaponFromStore(String input) {
        Weapon weapon = null;
        switch (input) {
        case "1":
            weapon = WeaponFactory.createGun();
            break;
        case "2":
            weapon = WeaponFactory.createBat();
            break;
        }
        return weapon;
    }

}
