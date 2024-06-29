package more_ex3;

public abstract class Quest {
    public void executeQuest(){
        assignObjectives();
        provideReward();

    }
    public abstract void assignObjectives();
    public abstract void provideReward();
}
