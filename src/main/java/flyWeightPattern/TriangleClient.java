package flyWeightPattern;

public class TriangleClient {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "yellow"};

        for (int i = 0; i < 10; i++) {
            TriangleSingleton instance = TriangleSingleton.INSTANCE;
            instance.setX((int)(Math.random() * 10));
            instance.setY((int)(Math.random() * 10));
            instance.setRadius((int)(Math.random() * 10));
            instance.draw();
        }
    }
}
