package decoratePattern.practice.improver;

import decoratePattern.practice.Drink;

public class Soy extends Taste{


    public Soy(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getMenuInfo() {
        return drink.getMenuInfo() + " Soy";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.10;
    }
}
