package adaptorPattern.phoneExample;

/**
 * adaptee : Thunderbolt
 * target : IphoneCharger
 *
 */
public class ThunderboltToUsbCAdapter implements IphoneCharger{

    UsbCharger usbCharger;

    public ThunderboltToUsbCAdapter(UsbCharger usbCharger) {
        this.usbCharger = usbCharger;

    }

    @Override
    public String chargeIphone() {
        return usbCharger.chargeGalaxy() + "(using adapter)";
    }
}
