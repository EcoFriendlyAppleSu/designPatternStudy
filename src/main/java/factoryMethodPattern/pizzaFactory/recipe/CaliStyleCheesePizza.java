package factoryMethodPattern.pizzaFactory.recipe;

public class CaliStyleCheesePizza extends Pizza {
    public CaliStyleCheesePizza() {
        name = "켈리포니아 스타일 소스와 치즈 피자";
        dough = "Thick";
        sauce = "smooth sauce";

        toppings.add("cheese and galic");
    }
}
