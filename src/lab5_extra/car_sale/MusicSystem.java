package lab5_extra.car_sale;

public class MusicSystem extends Decorator {
    public final double MUSIC_SYSTEM_COST = 1000.0;

    public MusicSystem(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Music System";
    }

    @Override
    public double cost() {
        return super.cost() + MUSIC_SYSTEM_COST;
    }


}
