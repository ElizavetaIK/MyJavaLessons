package lesson28;

public class Car implements Vehicle {
    //класс, который реализиует методы интерфейса. Implements

    @Override
    public void start() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");

    }

    @Override
    public void vehicleWait() {
        System.out.println("Car is waiting");
    }

}
