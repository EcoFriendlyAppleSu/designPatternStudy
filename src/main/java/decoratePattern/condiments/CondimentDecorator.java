package decoratePattern.condiments;

import decoratePattern.Beverage;

/**
 * Decorator 추상 데코레이터
 * 부모 클래스의 데이터들이 캡슐화가 되어있다.
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    /**
     * abstract method 구현
     * @return
     */
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
