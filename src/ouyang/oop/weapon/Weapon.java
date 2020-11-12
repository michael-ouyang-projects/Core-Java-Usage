package ouyang.oop.weapon;

public abstract class Weapon {

    private int id;
    private String name;
    private String color;
    private int power;
    private WeaponStatus status;

    public Weapon(int id, String name, String color, int power, WeaponStatus status) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.power = power;
        this.status = status;
    }

    public abstract void attack();

    // Inheritance (Reuse methods)
    public String getInfo() {
        return String.format("Id: %d\nName: %s\nColor: %s\nPower: %d\nStatus: %s", id, name, color, power, status.getDescription());
    }

    public int getId() {
        return id;
    }

    // Encapsulation (field)
    // public void setId(int id) {
    // this.id = id;
    // }

    public String getName() {
        return name;
    }

    // Encapsulation (field)
    // public void setName(String name) {
    // this.name = name;
    // }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public WeaponStatus getStatus() {
        return status;
    }

    public void setStatus(WeaponStatus status) {
        this.status = status;
    }

}
