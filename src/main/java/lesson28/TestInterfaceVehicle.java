package lesson28;

import java.util.LinkedList;
import java.util.List;

public class TestInterfaceVehicle {
    public static void main(String[] args) {
        //задаем объект через интерфейс, будут доступны методы,
        //которые заданы в интерфейсе
        Vehicle car = new Car();
        ElectricVehicle eBike = new ElectricBike();
        car.start();
        eBike.start();
        car.stop();
        eBike.stop();
        eBike.charge();
        car.vehicleWait();
        eBike.vehicleWait();
        car.displayVehicleStatus();
        eBike.displayVehicleStatus();
    }


}
