package decoratePattern.practiceDecoratePattern.roastings;

public class DarkRoasting implements Roasting {

    private float roastingCharge = 2.2f;

    public DarkRoasting() {
        System.out.println("DarkRoasting.DarkRoasting");
    }

    public DarkRoasting(float sentCharge) {
        this.roastingCharge += sentCharge;
    }

    @Override
    public float returnValue() {
        return roastingCharge;
    }
}
