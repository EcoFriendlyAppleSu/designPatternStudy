package factoryMethodPattern.pizzaFactory.recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Pizza Domain
 */
public abstract class Pizza {
    public String name;
    public float cost;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("피자 준비 = " + name);
        System.out.println("도우 준비 중");
        System.out.println("소스 뿌리는 중");
        System.out.println("토핑 올리는 중");
        for (String topping :
                toppings) {
            System.out.println(" " + topping);

        }
    }

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut() {
        System.out.println("8 조각으로 자르기");
    }
    public void box() {
        System.out.println("박스에 담기");
    }

    public String getName() {
        return name;
    }
}

