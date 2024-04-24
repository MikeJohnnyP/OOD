package lab5_extra.netflix_subscription;

public class NoAds extends SubscriptionDecorator {

    public NoAds(Features features) {
        super(features);
    }

    @Override
    public String getDescription() {
        return features.getDescription() + "\nNo Ads: +$" + getPricing() + "/month";
    }

    @Override
    public double getPricing() {
        return features.getPricing() + 3.00;
    }

}
