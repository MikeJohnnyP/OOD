package lab8.ex2;

public abstract class TitleInfo {
    private String titleName = "";

    public void processTitleInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(getTitleBurb());
        builder.append(getDvdEncodingInfo());
        System.out.println(builder.toString());
    }

    public abstract String getTitleBurb();

    public String getDvdEncodingInfo() {
        return "";
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }

}
