package factoryMethodPattern.pizzaFactory;

import factoryMethodPattern.pizzaFactory.recipe.Pizza;
import factoryMethodPattern.pizzaFactory.store.CaliPizza;
import factoryMethodPattern.pizzaFactory.store.NYPizza;
import factoryMethodPattern.pizzaFactory.store.PizzaStore;

public class ExePizzaStore {
    public static void main(String[] args) {
        PizzaStore nyStylePizza = new NYPizza();
        PizzaStore caliPizza = new CaliPizza();

        Pizza pizza = nyStylePizza.orderPizza("cheese");
        System.out.println("Lee가 주문한 " + pizza.getName());
        pizza = caliPizza.orderPizza("beef");
        System.out.println("Kim이 주문한 " + pizza.getName());

    }
}
