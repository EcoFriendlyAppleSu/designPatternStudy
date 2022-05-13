package flyWeightPattern;

public enum TriangleSingleton implements Shape{
    INSTANCE;

    String color;
    int x;
    int y;
    int radius;

    TriangleSingleton(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    TriangleSingleton() {

    }

    @Override
    public void draw() {
        System.out.println("[Color = " + color + ", x = " + x + ", y = " + y + ", radius = " + radius + " ]");
    }
}
