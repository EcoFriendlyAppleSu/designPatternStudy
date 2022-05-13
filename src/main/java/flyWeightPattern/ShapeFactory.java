package flyWeightPattern;

import java.util.HashMap;

/**
 * 객체 생성 부
 */
public class ShapeFactory {

    private final static HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        // key = String type Color var
        // value = Circle type Object var
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println(" New Object " + color + " Create");

        }
        return circle;
    }
}

