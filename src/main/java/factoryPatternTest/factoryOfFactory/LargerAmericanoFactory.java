package factoryPatternTest.factoryOfFactory;

import factoryPatternTest.factoryUnit.beer.Bear;
import factoryPatternTest.factoryUnit.beer.Lager;
import factoryPatternTest.factoryUnit.coffee.Americano;
import factoryPatternTest.factoryUnit.coffee.Coffee;

public class LargerAmericanoFactory implements OrderFactory{
    @Override
    public Bear createBear() {
        return new Lager();
    }

    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
