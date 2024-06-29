package lab8.ex6;

public abstract class BeverageMaker {
    void makeBeverage() {
        addBeverage();
        addCondiments();
    }

    abstract void addBeverage();

    abstract void addCondiments();
}
