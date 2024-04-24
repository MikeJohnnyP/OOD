package lab5_extra.netflix_subscription;

public class SubscriptionDecorator implements Features {
    Features features;

    public SubscriptionDecorator(Features features) {
        this.features = features;
    }

    @Override
    public String getDescription() {
        return features.getDescription();
    }

    @Override
    public double getPricing() {
        return features.getPricing();
    }

}
