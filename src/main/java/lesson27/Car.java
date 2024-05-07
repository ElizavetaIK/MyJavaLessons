package lesson27;

public class Car extends Vehicle{

    private int numDoors;

    public Car(int year, String brand, int numDoors) {
        super(year, brand);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                "} " + super.toString();
    }
}
