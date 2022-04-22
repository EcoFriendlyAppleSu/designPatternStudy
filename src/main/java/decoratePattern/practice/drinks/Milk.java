package decoratePattern.practice.drinks;

import decoratePattern.practice.Drink;

public class Milk extends Drink {

    public Milk() {
        menuInfo = "Milk";
    }

    @Override
    public double cost() {
        return 1.50f;
    }
}
