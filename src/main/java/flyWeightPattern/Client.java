package flyWeightPattern;

public class Client {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "white"};



        long startWithoutPattern = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(colors[(int) (Math.random() * 4)]);
            circle.setX((int)(Math.random() * 10));
            circle.setY((int)(Math.random() * 10));
            circle.setRadius((int)(Math.random() * 10));
            circle.draw();
        }

        long endWithoutPattern = System.nanoTime();

        System.out.println();
        System.out.println(" FlyWeight Pattern 적용하지 않을 시 걸리는 시간 = " + (endWithoutPattern - startWithoutPattern));

        long startApplyPattern = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[(int) (Math.random() * 4)]);
            circle.setX((int)(Math.random() * 10));
            circle.setY((int)(Math.random() * 10));
            circle.setRadius((int)(Math.random() * 10));
            circle.draw();
        }

        long endApplyPattern = System.nanoTime();

        System.out.println();
        System.out.println(" FlyWeight Pattern 적용 시 걸리는 시간 = " + (endApplyPattern - startApplyPattern));
        System.out.println();

    }
}
