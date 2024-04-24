package lab5_extra.online_shopping_plaform;

import java.util.ArrayList;
import java.util.List;

public abstract class Vendor {
    private List<BaseProduct> products = new ArrayList<>();

    public void printList() {
        if (products == null) {
            System.out.println("No products available");
            return;
        }
        for (BaseProduct product : products) {
            System.out.println(product);
            System.out.println();
        }
    }

    public void addProduct(BaseProduct product) {
        products.add(product);
    }

    public abstract void init();

}
