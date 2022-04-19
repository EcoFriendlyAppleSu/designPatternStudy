package factoryPatternTest;

import factoryPatternTest.factoryOfFactory.ExecuteFactoryOfFactory;
import factoryPatternTest.factoryUnit.ExecuteFactory;

public class RunningMain {
    public static void main(String[] args) {

        ExecuteFactoryOfFactory.getInstance().createOrder("userA");

    }
}
