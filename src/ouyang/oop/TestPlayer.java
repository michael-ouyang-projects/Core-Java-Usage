package ouyang.oop;

import ouyang.oop.weapon.Weapon;

public class TestPlayer {
    
    private Weapon weapon;

    public void attack() {
        weapon.attack();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
