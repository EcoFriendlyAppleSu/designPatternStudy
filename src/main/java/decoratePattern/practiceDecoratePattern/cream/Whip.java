package decoratePattern.practiceDecoratePattern.cream;

import decoratePattern.practiceDecoratePattern.favor.Favor;
import decoratePattern.practiceDecoratePattern.favor.Mocha;

public class Whip implements Cream {

    private Favor favor;
    private float charge = 3.3f;

    public Whip() {
    }

    public Whip(float sentCharge) {
        this.charge += sentCharge;
        cost();
    }

    @Override
    public float cost() {
        favor = new Mocha(charge);
        return favor.returnValue();
    }

}
