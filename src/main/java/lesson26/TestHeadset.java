package lesson26;

public class TestHeadset {
    //наследники имеют полный доступ к методам родителя
    public static void main(String[] args) {
        AppleHeadset appleHeadset = new AppleHeadset(true, "white",ConnectionType.WIRELESS, "Apple", Size.SMALL, 70, true, ChargingType.INDUCTION, "1,2");
        System.out.println(appleHeadset.getChargingType());


    SamsungHeadsetExperimental samsungHeadsetExperimental = new SamsungHeadsetExperimental(true, "white",ConnectionType.WIRELESS, "Samsung", Size.SMALL, 70, true, ChargingType.INDUCTION, true, true);
    System.out.println(samsungHeadsetExperimental.getColor());
}
}
