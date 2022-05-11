package commandPattern.cmdPractice.cmdClasses.toilet;

public class Toilet {

    private String name;

    public Toilet(String name) {
        this.name = name;
    }

    public void lightOn() {
        System.out.println("Toilet Light is on " + this.name);
    }

    public void lightOff() {
        System.out.println("Toilet Light is off " + this.name);
    }
}
