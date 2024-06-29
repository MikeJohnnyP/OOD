package more_ex3;

public class Warrior extends Character {

    @Override
    public void completeObjectives() {
        System.out.println("Warrior completed objectives");
    }

    @Override
    public void claimReward() {
        System.out.println("Warrior claimed reward");
    }

    @Override
    public void acceptQuest() {
        System.out.println("Warrior accepted quest");
    }

}
