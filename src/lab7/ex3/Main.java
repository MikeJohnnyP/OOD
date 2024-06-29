package lab7.ex3;

public class Main {
    public static void main(String[] args) {
        LienHe lienHe = new LienHeImpl("Nguyen", "Van A", "Developer", "FPT Software");
        System.out.println(lienHe);
        Contact contactAdapter = new ContactAdapterImpl(lienHe);
        System.out.println(contactAdapter);

        Contact engContact = new ContactImpl("Johny", "Dang", "Facebook inc", "Director");
        System.out.println(engContact);
        LienHe lienHeAdapter = new LienHeAdapter(engContact);
        System.out.println(lienHeAdapter);
    }
}
