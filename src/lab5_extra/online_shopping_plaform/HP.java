package lab5_extra.online_shopping_plaform;

public class HP extends Vendor {

    @Override
    public void init() {
        addProduct(new Printer(new Laptop()));
        addProduct(new Keyboard(new Moniter()));
        addProduct(new Mouse(new Keyboard(new Laptop())));
        addProduct(new HeadPhone(new Keyboard(new Mouse(new Printer(new Moniter())))));
        addProduct(new AntiViruss(new Televison()));
    }

}
