package lab3.ex2;

public class NewReleasePrice implements PriceStrategy {

    @Override
    public double getCharge(int rentDay) {
        return  rentDay * NEWRELEASE_PRICE;
    }

    @Override
    public double getFrequentRenterPointers(int rentDay) {
        if (rentDay > 1) {
            return 2;
        }
        return 1;
    }

}
