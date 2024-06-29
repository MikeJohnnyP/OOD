package more.ex2;

public class Main {
  public static void main(String[] args) {
    VehicleStore nyStore = new NYVehicleStore();
    Vehicle nyVehicle = nyStore.createVehicle(VehicleType.TRUCK);
    nyVehicle.assembly();
    System.out.println(nyVehicle);

    nyVehicle = nyStore.createVehicle(VehicleType.CAR);
    nyVehicle.assembly();
    System.out.println(nyVehicle);

    nyVehicle = nyStore.createVehicle(VehicleType.MOTORCYCLE);
    nyVehicle.assembly();
    System.out.println(nyVehicle);
  }
}
