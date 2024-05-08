package lesson28;

public class ElectricBike implements ElectricVehicle{
    @Override
    public void charge() {
        System.out.println("Electric bike has a charging");
    }

    @Override
    public void start() {
        System.out.println("Electric bike is running");
    }

    @Override
    public void stop() {
        System.out.println("Electric bike is stopping");

    }

    @Override
    public void vehicleWait() {
        System.out.println("Electric bike is waiting");

    }
}
