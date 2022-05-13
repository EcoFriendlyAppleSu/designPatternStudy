package singletonPattern;

public class Singleton {

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;

        System.out.println(instance.getValue());
        instance.setValue(3);
        System.out.println(instance.getValue());
    }
}
