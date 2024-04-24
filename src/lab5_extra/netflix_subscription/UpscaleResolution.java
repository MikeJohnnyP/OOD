package lab5_extra.netflix_subscription;

public class UpscaleResolution extends SubscriptionDecorator {
    public final double UPSCALE_RESOLUTION = 2.00;

    public UpscaleResolution(Features features) {
        super(features);
    }

    @Override
    public double getPricing() {
        return features.getPricing() + UPSCALE_RESOLUTION;
    }

    @Override
    public String getDescription() {
        return features.getDescription() + "\nUpscale Resolution to 4K: +$" + UPSCALE_RESOLUTION + "/month";
    }

}
