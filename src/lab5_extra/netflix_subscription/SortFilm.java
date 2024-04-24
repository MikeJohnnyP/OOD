package lab5_extra.netflix_subscription;

public class SortFilm extends SubscriptionDecorator {
    public final double COST = 1.00;

    public SortFilm(Features features) {
        super(features);
    }

    @Override
    public double getPricing() {
        return features.getPricing() + COST;
    }

    @Override
    public String getDescription() {
        return features.getDescription() + "\nSort Film by Genre: +$" + COST + "/month";
    }

}
