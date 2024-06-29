package lab8.ex5;

public class Main {
    public static void main(String[] args) {
        GameCharacter ch = new Mage();
        ch.createCharacter();

        ch = new Warrior();
        ch.createCharacter();
    }
}
