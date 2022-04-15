package factoryMethodPattern.classes;

import factoryMethodPattern.types.Type;
import factoryMethodPattern.types.TypeA;
import factoryMethodPattern.types.TypeB;
import factoryMethodPattern.types.TypeC;

public class TypeFactory {
    public Type createType(String type) {
        switch (type) {
            case "A":
                new TypeA();
                break;
            case "B":
                new TypeB();
                break;
            case "C":
                new TypeC();
                break;
        }
        return null;
    }
}
