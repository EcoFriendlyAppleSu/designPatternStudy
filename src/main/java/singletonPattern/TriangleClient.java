package singletonPattern;

import java.util.Random;

public class TriangleClient {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int pick = new Random().nextInt(TriangleSingleton.values().length);

            TriangleSingleton value = TriangleSingleton.values()[pick];

            value.setX((int) (Math.random() * 10));
            value.setY((int) (Math.random() * 100));
            value.setRadius((int) (Math.random() * 100));
            value.setColor(value.name());
            value.draw();

        }
    }
}
