package factoryMethodPattern.pizzaFactory.recipe;

public class CaliStyleBeefPizza extends Pizza {
    public CaliStyleBeefPizza() {
        name = "켈리포니아 스타일 소스와 치즈 피자";
        dough = "Thick";
        sauce = "smooth sauce";

        toppings.add("papper and galic");
    }
}
