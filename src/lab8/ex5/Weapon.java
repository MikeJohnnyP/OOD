package lab8.ex5;

public class Weapon {
    private static Weapon weapon;

    private Weapon() {
    }

    public static Weapon instancesOf() {
        if (weapon == null) {
            weapon = new Weapon();
            return weapon;
        } else
            return weapon;
    }

    String createWeapon(String weapon) {
        char choice = convertString(weapon); 
        switch(choice){
            case '1' -> {return "Sword";}
            case '2' -> {return "Axe";}
            case '3' -> {return "Staff";}
            case '4' -> {return "Dagger";}
            case '5' -> {return "Galtling gun";}
            default -> {return "Not type of weapon";}
        }
    }

    char convertString(String text) {
        return text.toLowerCase().charAt(0);
    }
}
