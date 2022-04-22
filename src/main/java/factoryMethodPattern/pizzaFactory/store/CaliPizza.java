package factoryMethodPattern.pizzaFactory.store;

import factoryMethodPattern.pizzaFactory.recipe.CaliStyleBeefPizza;
import factoryMethodPattern.pizzaFactory.recipe.CaliStyleCheesePizza;
import factoryMethodPattern.pizzaFactory.recipe.Pizza;

public class CaliPizza extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new CaliStyleCheesePizza();
        } else if (type.equals("beef")) {
            return new CaliStyleBeefPizza();
        }
        return null;
    }
}
