package lab8.ex2;

public class GameTitleInfo extends TitleInfo {
    private String teamDevelopement;
    private String publisher;
    private String descriptionTag;

    public GameTitleInfo(String gameTitle, String teamDevelopement, String publisher, String descriptionTag) {
        setTitleName(gameTitle);
        this.teamDevelopement = teamDevelopement;
        this.publisher = publisher;
        this.descriptionTag = descriptionTag;
    }

    @Override
    public String getTitleBurb() {
        return "Game Title: " + this.getTitleName() + "\nTeam Developement: " + this.getTeamDevelopement()
                + "\nPublisher:  " + this.getPublisher() + "\nTag: " + this.getDescriptionTag();
    }

    public String getTeamDevelopement() {
        return teamDevelopement;
    }

    public void setTeamDevelopement(String teamDevelopement) {
        this.teamDevelopement = teamDevelopement;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescriptionTag() {
        return descriptionTag;
    }

    public void setDescriptionTag(String descriptionTag) {
        this.descriptionTag = descriptionTag;
    }

}
