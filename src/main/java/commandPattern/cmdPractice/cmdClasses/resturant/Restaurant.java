package commandPattern.cmdPractice.cmdClasses.resturant;

public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void lightOn() {
        System.out.println("Restaurant Light is on " + this.name);
    }

    public void lightOff() {
        System.out.println("Restaurant Light is off " + this.name);
    }
}
