package factoryPatternTest.factoryOfFactory;

import factoryPatternTest.factoryUnit.beer.Bear;
import factoryPatternTest.factoryUnit.coffee.Coffee;

public interface OrderFactory {

    Bear createBear();

    Coffee createCoffee();
}
