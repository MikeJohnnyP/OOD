package lab5_extra.netflix_subscription;

public class UnitedStates implements Region {

    private Features features;

    public UnitedStates() {
        features = new StandardSubscription();
        features = new SortFilm(features);
        features = new UpscaleResolution(new DecreasePricing(features));
    }

    @Override
    public String getRegion() {
        return "United States";
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
