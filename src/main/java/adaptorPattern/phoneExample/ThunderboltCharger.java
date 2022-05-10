package adaptorPattern.phoneExample;

public class ThunderboltCharger implements IphoneCharger{
    @Override
    public String chargeIphone() {
        return "Iphone uses thunderbolt charger";
    }

}
