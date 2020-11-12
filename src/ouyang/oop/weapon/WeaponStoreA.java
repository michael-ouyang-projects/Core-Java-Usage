package ouyang.oop.weapon;

public class WeaponStoreA implements WeaponStore {

    public void showWeaponsInStore() {
        System.out.println("1. Gun, 2. Super Gun, 3. Bat, 4. Super Bat");
    }

    public Weapon getWeaponFromStore(String input) {
        Weapon weapon = null;
        switch (input) {
        case "1":
            weapon = WeaponFactory.createGun();
            break;
        case "2":
            weapon = WeaponFactory.createSuperGun();
            break;
        case "3":
            weapon = WeaponFactory.createBat();
            break;
        case "4":
            weapon = WeaponFactory.createSuperBat();
            break;
        }
        return weapon;
    }

}
