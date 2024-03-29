package lab3.ex2;

public class Movie {
    private boolean available;
    private String title;
    private PriceStrategy price;

    public Movie(String title, PriceStrategy price) {
        this.title = title;
        this.price = price;
        this.available = true;
    }

    public double getCharge(int rentDay) {
        return price.getCharge(rentDay);
    }

    public double getFrequentRenterPointers(int rentDay) {
        return price.getFrequentRenterPointers(rentDay);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PriceStrategy getPrice() {
        return price;
    }

    public void setPrice(PriceStrategy price) {
        this.price = price;
    }

}
