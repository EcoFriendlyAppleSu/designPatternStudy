package decoratePattern.practice.drinks;

import decoratePattern.practice.Drink;

public class Soda extends Drink {

    public Soda() {
        menuInfo = "Soda";
    }

    @Override
    public double cost() {
        return 1.70;
    }

}
