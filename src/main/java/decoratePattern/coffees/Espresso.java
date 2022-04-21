package decoratePattern.coffees;

import decoratePattern.Beverage;

public class Espresso extends Beverage {

    /**
     * 상속받은 description 값 대입
     */
    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
