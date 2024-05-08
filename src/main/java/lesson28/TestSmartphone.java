package lesson28;

public class TestSmartphone {
    public static void main(String[] args) {
        //создаем объект от класса напрямую
        Smartphone smartphone = new Smartphone();
        smartphone.charge();
        smartphone.connect();
        //создаем объект от интерфейса, чтобы избежать ненужных функций
        Chargeable nokia = new Smartphone();
        nokia.charge();

        Connectable nokiaPhone = new Smartphone();
        nokiaPhone.connect();

        GPSable nokiaPro = new Smartphone();
        nokiaPro.getlocation();

    }
}
