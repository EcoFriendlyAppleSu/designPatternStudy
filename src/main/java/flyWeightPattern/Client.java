package flyWeightPattern;

public class Client {
    public static void main(String[] args) {
        // == 아이스크림 회사
        String[] colors = {"red", "blue", "green", "white", "yellow"};

        // 싱글턴 -> 가변
        // 불변
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
