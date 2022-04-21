package decoratePattern.coffees;

import decoratePattern.Beverage;

public class DarkRoast extends Beverage {

    /**
     * 상속받은 description 값 대입
     */
    public DarkRoast() {
        description = "dark roast coffee";
    }

    @Override
    public double cost() {
        return 2.10;
    }
}
