package factoryMethodPattern.pizzaFactory.recipe;

public class NYStyleBeefPizza extends Pizza {
    public NYStyleBeefPizza() {
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "Thin";
        sauce = "hot sauce";

        toppings.add("Beef");
    }
}
