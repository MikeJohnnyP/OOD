package lab8.ex2;

public class BookTitleInfo extends TitleInfo {
    private String authorName;
    private int yearPublic;

    public BookTitleInfo(String bookTitle, String authorName, int yearPublic) {
        setTitleName(bookTitle);
        this.authorName = authorName;
        this.yearPublic = yearPublic;
    }

    @Override
    public String getTitleBurb() {
        return "BookTile: " + getTitleName() + "\nAuthor: " + this.getAuthorName()
                + "\nYear Public: " + this.getYearPublic();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

}
