package lab5_extra.online_shopping_plaform;

public class TestVendor {
    public static void main(String[] args) {
        Vendor vendor = new Dell();
        vendor.init();
        vendor.printList();

        Vendor vendor2 = new Samsung();
        vendor2.init();
        vendor2.printList();

        Vendor vendor3 = new HP();
        vendor3.init();
        vendor3.printList();
    }

}
