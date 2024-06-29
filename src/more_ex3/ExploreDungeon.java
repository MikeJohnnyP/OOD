package more_ex3;

public class ExploreDungeon extends Quest {

    @Override
    public void assignObjectives() {
        System.out.println("Explore the dungeon.");
    }

    @Override
    public void provideReward() {
        System.out.println("You have been rewarded with a new spell.");
    }

}
