package factoryMethodPattern.pizzaFactory.store;

import factoryMethodPattern.pizzaFactory.recipe.NYStyleBeefPizza;
import factoryMethodPattern.pizzaFactory.recipe.NYStyleCheesePizza;
import factoryMethodPattern.pizzaFactory.recipe.Pizza;

public class NYPizza extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("beef")) {
            return new NYStyleBeefPizza();
        }
        return null;
    }
}
