package lesson26;

//extent и класс с общими свойствами
public class AppleHeadset extends Headset{

    private String softwareVersion;
    //конструктор добавит общие и уникальные свойства
    public AppleHeadset(boolean waterresistant, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingType chargingType, String softwareVersion) {
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro, chargingType);
        this.softwareVersion = softwareVersion;
    }
    //геттер создасться только для уникального свойства
    public String getSoftwareVersion() {
        return softwareVersion;
    }
}
