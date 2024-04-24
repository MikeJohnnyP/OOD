package lab5_extra.netflix_subscription;

public class DecreasePricing extends SubscriptionDecorator {
    public final double DECREASE_PRICING = 2.00;

    public DecreasePricing(Features features) {
        super(features);
    }

    @Override
    public double getPricing() {
        return features.getPricing() - DECREASE_PRICING;
    }

    @Override
    public String getDescription() {
        return features.getDescription() + "\nDecrease Pricing: -$" + DECREASE_PRICING + "/month";
    }
}
