package lab5_extra.online_shopping_plaform;

public class Dell extends Vendor {

    @Override
    public void init() {
        addProduct(new Printer(new Laptop()));
        addProduct(new Mouse(new Moniter()));
        addProduct(new Mouse(new Keyboard(new Laptop())));
        addProduct(new AntiViruss(new Laptop()));
        addProduct(new HeadPhone(new Keyboard(new Laptop())));
    }

}
