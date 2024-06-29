package more_ex3;

public class DefeatEnemies extends Quest{

    @Override
    public void assignObjectives() {
        System.out.println("Defeat 10 enemies.");
    }

    @Override
    public void provideReward() {
        System.out.println("You have been rewarded with a new weapon.");
    }

}
