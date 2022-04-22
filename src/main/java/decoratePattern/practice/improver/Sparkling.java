package decoratePattern.practice.improver;

import decoratePattern.practice.Drink;

public class Sparkling extends Taste{


    public Sparkling(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getMenuInfo() {
        return drink.getMenuInfo() + " Sparkling";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.15;
    }
}
