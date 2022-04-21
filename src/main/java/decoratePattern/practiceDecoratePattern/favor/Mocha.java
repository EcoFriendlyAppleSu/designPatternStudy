package decoratePattern.practiceDecoratePattern.favor;

import decoratePattern.practiceDecoratePattern.roastings.DarkRoasting;
import decoratePattern.practiceDecoratePattern.roastings.Roasting;

public class Mocha implements Favor{

    private Roasting roasting;
    private float favorCharge = 1.0f;
    private float totalCost = 0;

    public Mocha() {
        System.out.println("Mocha.Mocha");
        returnValue();
    }

    public Mocha(float sentCharge) {
        this.favorCharge += sentCharge;
        returnValue();
    }

    @Override
    public float returnValue() {
        roasting = new DarkRoasting(favorCharge);
        totalCost = roasting.returnValue();
        return this.totalCost;
    }


}
