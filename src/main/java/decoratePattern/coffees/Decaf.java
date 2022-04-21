package decoratePattern.coffees;

import decoratePattern.Beverage;

public class Decaf extends Beverage {

    /**
     * 상속받은 description 값 대입
     */
    public Decaf() {
        description = "Decaffeine coffee";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
