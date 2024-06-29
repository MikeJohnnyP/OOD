package lab8.ex5;

import java.util.Scanner;

public abstract class GameCharacter {
    void createCharacter() {
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nhan vat: ");
        builder.append("Ten nhan vat: " + selectName(sc) + "\n");
        builder.append("Lop nhan vat: " + classType() + '\n');
        System.out.println("Chon vu khi: ");
        weaponType();
        builder.append("Weapon: " + Weapon.instancesOf().createWeapon(sc.nextLine()) + "\n");
        builder.append("Chi so co ban: \n" + baseStat() + '\n');
        builder.append("Phep thuat: " + selectAbilities() + '\n');
        System.out.println(builder.toString());
        sc.close();
    }

    String selectName(Scanner sc) {
        String result = sc.nextLine();
        return result;
    }

    abstract String classType();

    abstract String selectAbilities();

    abstract String baseStat();

    void weaponType() {
        System.out.println("1. Sword\n2. Axe\n3. Staff\n4. Dagger" +
                "\n5. Galtling gun");
    }
}
