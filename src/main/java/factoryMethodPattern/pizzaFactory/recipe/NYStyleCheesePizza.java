package factoryMethodPattern.pizzaFactory.recipe;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "Thin";
        sauce = "hot sauce";

        toppings.add("Cheeae");
    }
}
