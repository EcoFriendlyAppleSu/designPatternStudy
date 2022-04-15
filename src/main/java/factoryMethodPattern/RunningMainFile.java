package factoryMethodPattern;

import factoryMethodPattern.classes.ClassA;

/**
 * Factory Method Pattern
 * 객체마다 하는 일이 다르기 때문에 조건에 따라 분기를 통해 특정 객체를 생성해야 합니다.
 * 조건에 따른 객체 생성 부분을 자신이 직접하지 않고 팩토리 클래스에 위임하여 객체를 생성하도록 하는 방법
 */
public class RunningMainFile {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");
        classA.createType("C");

    }
}
