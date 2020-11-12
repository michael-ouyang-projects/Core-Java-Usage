package ouyang.oop.weapon;

// Factory (Encapsulation (creation))
public class WeaponFactory {

    private static int currentGunId;
    private static int currentbatId;

    public static Gun createGun() {
        return new Gun(currentGunId++, "Gun", "Black", 10, WeaponStatus.NORMAL);
    }

    public static Gun createSuperGun() {
        return new Gun(currentGunId++, "Super Gun", "Gold", 30, WeaponStatus.WELL);
    }

    public static Bat createBat() {
        return new Bat(currentbatId++, "Bat", "Brown", 5, WeaponStatus.NORMAL);
    }

    public static Bat createSuperBat() {
        return new Bat(currentbatId++, "Super Bat", "Gold", 15, WeaponStatus.WELL);
    }

}
