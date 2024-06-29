package more_ex3;

public class CollectItem extends Quest {

    @Override
    public void assignObjectives() {
        System.out.println("Throw 10 items into the well.");
    }

    @Override
    public void provideReward() {
        System.out.println("You have been rewarded with a new item.");
    }

}
