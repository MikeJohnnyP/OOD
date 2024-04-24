package lab5_extra.netflix_subscription;

public class StandardSubscription implements Features {
    public final double STANDARD_SUBSCRIPTION_COST = 6.99;

    @Override
    public String getDescription() {
        return "Standard Subscription: $" + STANDARD_SUBSCRIPTION_COST + "/month";
    }

    @Override
    public double getPricing() {
        return STANDARD_SUBSCRIPTION_COST;
    }
}
