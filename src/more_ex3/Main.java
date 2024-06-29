package more_ex3;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior();
        warrior.performQuest(new DefeatEnemies());

        Character rouge = new Rouge();
        rouge.performQuest(new ExploreDungeon());

        Character mage = new Mage();
        mage.performQuest(new CollectItem());
    }
}
