package factoryPatternTest.factoryOfFactory;

/**
 * static은 Exception을 사용하지 못합니다.
 */
public class ExecuteFactoryOfFactory {

    private ExecuteFactoryOfFactory() {
    }

    public static ExecuteFactoryOfFactory getInstance() {
        return ExecuteFactoryOfFactoryHolder.INSTANCE;
    }

    private static class ExecuteFactoryOfFactoryHolder {
        private static final ExecuteFactoryOfFactory INSTANCE = new ExecuteFactoryOfFactory();

    }

    public void createOrder(String order) {
        OrderFactory orderFactory = null;

        if (order.equals("userA")) {
            orderFactory = new IPALatteFactory();
        } else if (order.equals("userB")) {
            orderFactory = new LargerAmericanoFactory();
        }
        orderFactory.createBear();
        orderFactory.createCoffee();
    }
}
