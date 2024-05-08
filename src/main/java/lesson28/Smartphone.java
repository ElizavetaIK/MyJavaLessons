package lesson28;

public class Smartphone implements Chargeable, Connectable, GPSable{
    @Override
    public void charge() {
        System.out.println("Smartphone charges");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone connects");

    }

    @Override
    public String getlocation() {
        return "Location ";
    }
}
