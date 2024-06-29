package lab8.ex2;

public class Main {
    public static void main(String argr[]) {
        System.out.println("DvdTitle");
        TitleInfo info = new DvdTitleInfo("Angel Jollie", "Fall into the sky", "Russian");
        info.processTitleInfo();

        System.out.println("\nBookTitle");
        info = new BookTitleInfo("Dune", "Frank Herbert", 1965);
        info.processTitleInfo();

        System.out.println("\nGameTitle");
        info = new GameTitleInfo("The Last Of Hope", "Nauty Dog studio", "Sony Interactive Entertaiment",
                "Action, adventures, horor survival, single play");
        info.processTitleInfo();
    }
}
