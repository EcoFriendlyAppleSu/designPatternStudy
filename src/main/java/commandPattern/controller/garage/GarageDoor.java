package commandPattern.controller.garage;

public class GarageDoor {

    private String garageName;

    public GarageDoor(String garageName) {
        this.garageName = garageName;
    }

    void up() {
        System.out.println("Up the garage Door");
    }

    void down() {
        System.out.println("Down the garage Door");
    }

    void stop() {
        System.out.println("Stop the garage Door");
    }

    void lightOn() {
        System.out.println("the light is on");
    }

    void lightOff() {
        System.out.println("the light is off");
    }
}
