package lab5_extra.netflix_subscription;

public class China implements Region {
    private Features features;

    public China() {
        features = new StandardSubscription();
        features = new SortFilm(features);
        features = new DecreasePricing(features);
    }

    @Override
    public String getRegion() {
        return "China";
    }

    @Override
    public double getCost() {
        return features.getPricing();
    }

    @Override
    public String getFeatures() {
        return features.getDescription();
    }

    @Override
    public void addFeatures(Features features) {
        this.features = features;
    }

}
