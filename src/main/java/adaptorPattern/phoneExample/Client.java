package adaptorPattern.phoneExample;

public class Client {
    public static void main(String[] args) {
        ThunderboltCharger thunderboltCharger = new ThunderboltCharger();
        UsbCharger usbCharger = new UsbCharger();

        System.out.println(thunderboltCharger.chargeIphone());
        System.out.println(usbCharger.chargeGalaxy());
        System.out.println("==============================");

        /**
         * IphoneCharger 를 반환값으로 설정해 확장
         */
        IphoneCharger thunderboltToUsbCAdapter = new ThunderboltToUsbCAdapter(usbCharger);
        System.out.println(thunderboltToUsbCAdapter.chargeIphone());
    }
}
