package factoryMethodPattern.classes;

import factoryMethodPattern.types.Type;

/**
 * 객체 생성에 참여하지 않고 로직에 메세지에 집중할 수 있다.
 */
public class ClassA {
    public Type createType(String type) {
        TypeFactory typeFactory = new TypeFactory();
        Type type1 = typeFactory.createType(type);
        return type1;
    }
}
