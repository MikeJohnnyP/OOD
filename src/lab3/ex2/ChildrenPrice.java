package lab3.ex2;

public class ChildrenPrice implements PriceStrategy {

    @Override
    public double getCharge(int rentDay) {
        double result = 0;
        if (rentDay > 3)
            result += ((rentDay - 3) * CHILDREN_PRICE_4DAYS) + (CHILDREN_PRICE * 3);
        else
            result += rentDay * CHILDREN_PRICE;
        return result;

    }

    @Override
    public double getFrequentRenterPointers(int rentDay) {
        return 1;
    }

}
