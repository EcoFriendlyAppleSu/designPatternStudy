package decoratePattern.practice.improver;

import decoratePattern.practice.Drink;

public abstract class Taste extends Drink {


    public Drink drink;

    @Override
    public abstract String getMenuInfo();

    @Override
    public double cost(){
        return 0;
    }
}
