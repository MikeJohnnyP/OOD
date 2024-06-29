package more_ex3;

public class Rouge extends Character {

    @Override
    public void completeObjectives() {
        System.out.println("Rouge completed objectives");
    }

    @Override
    public void claimReward() {
        System.out.println("Rouge claimed reward");
    }

    @Override
    public void acceptQuest() {
        System.out.println("Rouge accepted quest");
    }

}
