package factoryPatternTest.factoryUnit;

import factoryPatternTest.factoryUnit.beer.Bear;
import factoryPatternTest.factoryUnit.beer.IPA;
import factoryPatternTest.factoryUnit.beer.Lager;
import factoryPatternTest.factoryUnit.coffee.Americano;
import factoryPatternTest.factoryUnit.coffee.Coffee;
import factoryPatternTest.factoryUnit.coffee.Latte;

public class ExecuteFactory {
    public static void createOrder(String order) {

        if (order.equals("beer")) {
            Bear ipa = new IPA();
            Bear lager = new Lager();
        } else if (order.equals("coffee")) {
            Coffee americano = new Americano();
            Coffee latte = new Latte();
        }
        return;
    }
}
