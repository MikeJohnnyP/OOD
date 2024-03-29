package lab3.ex2;

public class SerialPrice implements PriceStrategy {

    @Override
    public double getCharge(int rentDay) {
        double result = 0;
        if (rentDay > 2)
            result += ((rentDay - 2) * SERIAL_PRICE_3DAYS) + (SERIAL_PRICE * 2);
        else
            result += rentDay * SERIAL_PRICE;
        return result;
    }

    @Override
    public double getFrequentRenterPointers(int rentDay) {
        return 1;
    }

}
