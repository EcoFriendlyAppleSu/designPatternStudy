package decoratePattern.coffees;

import decoratePattern.Beverage;

public class HouseBlend extends Beverage {

    /**
     * 상속받은 description 값 대입
     */
    public HouseBlend() {
        description = "house blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
