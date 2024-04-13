package lesson26;

public class SamsungHeadsetExperimental extends SamsungHeadset{

    private boolean stepCounter;

    public SamsungHeadsetExperimental(boolean waterresistant, String color, ConnectionType connectionType, String brand, Size size, int soundLevel, boolean hasMicro, ChargingType chargingType, boolean aiVersion, boolean stepCounter) {
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro, chargingType, aiVersion);
        this.stepCounter = stepCounter;

    }

    public boolean isStepCounter() {
        return stepCounter;
    }
}
