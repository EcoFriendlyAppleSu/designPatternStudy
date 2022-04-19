package factoryPatternTest.factoryOfFactory;

import factoryPatternTest.factoryUnit.beer.Bear;
import factoryPatternTest.factoryUnit.beer.IPA;
import factoryPatternTest.factoryUnit.coffee.Coffee;
import factoryPatternTest.factoryUnit.coffee.Latte;

public class IPALatteFactory implements OrderFactory{
    @Override
    public Bear createBear() {
        return new IPA();
    }

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
