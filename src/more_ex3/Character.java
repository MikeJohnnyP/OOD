package more_ex3;

public abstract class Character {
    public void performQuest(Quest quest) {
        acceptQuest();
        quest.executeQuest();
        completeObjectives();
        claimReward();
    }

    public abstract void acceptQuest();

    public abstract void completeObjectives();

    public abstract void claimReward();

}
