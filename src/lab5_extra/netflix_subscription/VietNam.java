package lab5_extra.netflix_subscription;

public class VietNam implements Region {
    private Features features;

    public VietNam() {
        features = new StandardSubscription();
        features = new UpscaleResolution(new DecreasePricing(features));
        features = new SortFilm(features);

    }

    @Override
    public String getRegion() {
        return "VietNam";
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
