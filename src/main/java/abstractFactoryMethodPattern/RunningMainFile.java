package abstractFactoryMethodPattern;

import abstractFactoryMethodPattern.factory.FactoryOfComputerFactory;

/**
 * Abstract Factory Pattern
 * Factory Method Pattern 에서는 구성마다 팩토리를 만들어 어떤 객체를 형성 하였고
 * Abstract Factory Pattern은 관련된 객체들을 한꺼번에 캡슐화 하여 팩토리로 만들어서 일관되게 객체를 생성하게 했다.
 */
public class RunningMainFile {
    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("SS");
    }
}
