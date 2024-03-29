package lab3.ex2;

public interface PriceStrategy {

    public static final double REGULAR_PRICE = 3000;
    public static final double NEWRELEASE_PRICE = 4000;
    public static final double CHILDREN_PRICE = 2500;
    public static final double SERIAL_PRICE = 2000;

    public static final double REGULAR_PRICE_3DAYS = 1000;
    public static final double CHILDREN_PRICE_4DAYS = 1500;
    public static final double SERIAL_PRICE_3DAYS = 1000;

    public double getCharge(int rentDay);

    public double getFrequentRenterPointers(int rentDay);

}
