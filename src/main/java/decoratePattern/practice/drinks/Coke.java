package decoratePattern.practice.drinks;

import decoratePattern.practice.Drink;

public class Coke extends Drink {

    public Coke() {
        menuInfo = "Coke";
    }

    @Override
    public double cost() {
        return 2.0f;
    }
}
