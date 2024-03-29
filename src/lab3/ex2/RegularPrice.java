package lab3.ex2;

public class RegularPrice implements PriceStrategy {

    @Override
    public double getCharge(int rentDay) {
        double result = 0;
        if (rentDay > 2)
            result += ((rentDay - 2) * REGULAR_PRICE_3DAYS) + (REGULAR_PRICE * 2);
        else
            result += rentDay * REGULAR_PRICE;
        return  result;
    }

    @Override
    public double getFrequentRenterPointers(int rentDay) {
        return 1;
    }

}
