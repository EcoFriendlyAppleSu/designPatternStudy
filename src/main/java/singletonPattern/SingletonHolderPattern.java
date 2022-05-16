package singletonPattern;

public class SingletonHolderPattern {

    // Constructor
    private SingletonHolderPattern() {
        System.out.println("Singleton Holder Pattern is Working");
    }

    private static class SingletonHolderPatternHolder{
        private static final SingletonHolderPattern INSTANCE = new SingletonHolderPattern();
    }

    public static SingletonHolderPattern getInstance() {
        return SingletonHolderPatternHolder.INSTANCE;
    }
}
