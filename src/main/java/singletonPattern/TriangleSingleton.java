package singletonPattern;

import flyWeightPattern.Shape;

/**
 * 해당 방법으로는 싱글톤을 지키면서 프로잭트를 수행할 수 없다.
 * INSTANCE, enum에 하나만 존재할 때 싱글톤 패턴을 정의할 수 있다.
 */
public enum TriangleSingleton implements Shape {

    RED, YELLOW, BLUE, BLACK;

    String color;
    int x;
    int y;
    int radius;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    TriangleSingleton() {

    }

    @Override
    public void draw() {
        System.out.println("[Color = " + color + ", x = " + x + ", y = " + y + ", radius = " + radius + " ]");
    }
}
