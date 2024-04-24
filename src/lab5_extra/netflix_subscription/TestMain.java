package lab5_extra.netflix_subscription;

public class TestMain {
    public static void main(String[] args) {
        Region region = new VietNam();
        System.out.println(region.getRegion());
        System.out.println("Total Price: " + region.getCost());
        System.out.println(region.getFeatures());

        System.out.println();

        Region region2 = new UnitedStates();
        System.out.println(region2.getRegion());
        System.out.println("Total price: " + region2.getCost());
        System.out.println(region2.getFeatures());

        System.out.println();

        Region region3 = new China();
        System.out.println(region3.getRegion());
        System.out.println("Total price: " + region3.getCost());
        System.out.println(region3.getFeatures());
    }
}
