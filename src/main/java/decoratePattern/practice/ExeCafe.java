package decoratePattern.practice;

import decoratePattern.practice.drinks.Coke;
import decoratePattern.practice.drinks.Milk;
import decoratePattern.practice.improver.Soy;
import decoratePattern.practice.improver.Sparkling;

import static decoratePattern.practice.Drink.Size.GRANDE;

public class ExeCafe {

    public static void main(String[] args) {
        Drink drink = new Coke();

        drink = new Soy(drink);
        drink = new Sparkling(drink);
        System.out.println("음료 종류 = " + drink.getMenuInfo()
                + " 지불할 금액 = " + drink.cost()
        );

        Drink milk = new Milk();
        milk.setSize(GRANDE);
        milk = new Soy(milk);
        milk = new Soy(milk);

        System.out.println("음료 종류 = " + milk.getMenuInfo()
                + " 지불할 금액 = " + milk.cost()
        );
    }
}
