package ouyang.oop;

import java.util.List;
import java.util.Scanner;

import ouyang.oop.weapon.Weapon;
import ouyang.oop.weapon.WeaponStore;
import ouyang.oop.weapon.WeaponStoreA;

public class GamePlace {

    private Scanner scanner;
    private Player player;
    private WeaponStore weaponStore;

    public GamePlace() {
        this.scanner = new Scanner(System.in);
        this.player = new Player();
        // Polymorphism
        this.weaponStore = new WeaponStoreA();
    }

    public void startGame() {
        execute();
        cleanup();
    }

    private void execute() {
        boolean keepPlaying;
        do {
            showUserValidMovement();
            String input = scanner.nextLine();
            keepPlaying = processMovement(input);
        } while (keepPlaying);
    }

    private void showUserValidMovement() {
        System.out.println("1. Attack, 2. Switch Weapon, 3. Check Currrent Weapon's Info, 4. Buy Weapon, 5. Leave");
    }

    private boolean processMovement(String input) {
        boolean keepPlaying = true;
        switch (input) {
        case "1":
            processPlayerAttack();
            break;
        case "2":
            processPlayerSwitchWeapon();
            break;
        case "3":
            processShowCurrentWeaponInfo();
            break;
        case "4":
            processPlayerBuyWeapon();
            break;
        case "5":
            keepPlaying = false;
        }
        System.out.println("---------------------------------------------");
        return keepPlaying;
    }

    private void processPlayerAttack() {
        player.attack();
    }

    private void processPlayerSwitchWeapon() {
        List<Weapon> weaponsInPocket = player.getWeaponsInPocket();
        if (weaponsInPocket.size() > 0) {
            System.out.println("Pick one to put in hand.");
            System.out.println(getWeaponsInfoFrom(weaponsInPocket));
            String input = scanner.nextLine();
            player.switchWeapon(Integer.parseInt(input));
        } else {
            System.out.println("No Weapon!");
        }
    }

    private String getWeaponsInfoFrom(List<Weapon> weaponsInPocket) {
        // String Concatenation
        StringBuilder weaponsInfo = new StringBuilder();
        int index = 0;
        for (Weapon weapon : weaponsInPocket) {
            weaponsInfo.append(String.format("%d. %s, ", ++index, weapon.getName()));
        }
        return weaponsInfo.substring(0, weaponsInfo.length() - 2).toString();
    }

    private void processShowCurrentWeaponInfo() {
        Weapon weapon = player.getWeaponInHand();
        if (weapon != null) {
            System.out.println(weapon.getInfo());
        } else {
            System.out.println("Your bare hand.");
        }
    }

    private void processPlayerBuyWeapon() {
        System.out.println("Go into Weapon Store...");
        do {
            System.out.println("Pick one to Buy! (Type 'quit' to leave store)");
            weaponStore.showWeaponsInStore();
            String input = scanner.nextLine();
            if ("quit".equals(input)) {
                break;
            }
            Weapon weapon = weaponStore.getWeaponFromStore(input);
            player.putWeaponToPocket(weapon);
        } while (true);
        System.out.println("Leave Weapon Store...");
    }

    private void cleanup() {
        // I/O Resources must be closed! (AutoCloseable by try-catch)
        scanner.close();
        System.out.println("Bye Bye!");
    }

}
