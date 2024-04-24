package lab5_extra.online_shopping_plaform;

public class Samsung extends Vendor {

    @Override
    public void init() {
        addProduct(new Mouse(new Oven()));
        addProduct(new HeadPhoneInEar(new Televison()));
        addProduct(new AntiViruss(new Laptop()));
        addProduct(new Oven());
        addProduct(new Printer(new WashingMachine()));
    }

}
