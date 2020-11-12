package ouyang.oop.weapon;

public enum WeaponStatus {

    WELL("Work like brand new"), NORMAL("In good health"), BROKEN("Need to repair");

    private String description;

    private WeaponStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
