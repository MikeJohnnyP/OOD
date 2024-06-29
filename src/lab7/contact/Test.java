package lab7.contact;

public class Test {

    public static void main(String[] args) {
        System.out.println("Example for the Adapter pattern");
        System.out.println();
        System.out
                .println("This example will demonstrate the Adapter by using the");
        System.out
                .println(" class ContactAdapter to translate from classes written");
        System.out
                .println(" in a foreign language (Chovnatlh and ChovnatlhImpl),");
        System.out
                .println(" enabling their code to satisfy the Contact interface.");
        System.out.println();
        System.out
                .println("Creating a new ContactAdapter. This will, by extension,");
        System.out
                .println(" create an instance of ChovnatlhImpl which will provide");
        System.out.println(" the underlying Contact implementation.");
    }

}
