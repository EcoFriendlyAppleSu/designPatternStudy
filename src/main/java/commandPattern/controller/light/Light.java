package commandPattern.controller.light;

public class Light {

    private String listName;

    public Light(String listName) {
        this.listName = listName;
    }

    public void on() {
        System.out.println("The Light is on");
    }

    public void off() {
        System.out.println("The Light is off");
    }
}
