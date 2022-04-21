package decoratePattern;

import decoratePattern.coffees.DarkRoast;
import decoratePattern.coffees.Espresso;
import decoratePattern.condiments.Mocha;
import decoratePattern.condiments.Soy;
import decoratePattern.condiments.Whip;

/**
 * Decorator Pattern
 * interface를 사용하지 않은 OCP 준수 패턴
 * java I/O에 적용, 잘 사용하면 기능 확장에 용이하지만 안쓰게 되는 메서드들이 많아진다.
 */
public class ExeDecorateProject {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println("음료 이름 = " + beverage.getDescription()
                + " 가격 = " + beverage.cost()
        );

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("음료 이름 = " + beverage2.getDescription()
                + " 가격 = " + beverage2.cost()
        );

        Beverage beverage3 = new DarkRoast();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        
        System.out.println("음료 이름 = " + beverage3.getDescription()
                + " 가격 = " + beverage3.cost()
        );
    }
}
