package more_ex3;

public class Mage extends Character {

    @Override
    public void completeObjectives() {
        System.out.println("Mage completed objectives");
    }

    @Override
    public void claimReward() {
        System.out.println("Mage claimed reward");
    }

    @Override
    public void acceptQuest() {
        System.out.println("Mage accepted quest");
    }


}
