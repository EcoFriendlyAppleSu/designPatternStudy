package commandPattern.cmdPractice.cmdClasses.resturant;

import commandPattern.cmdPractice.cmdClasses.Command;

public class RestaurantLightOff implements Command {

    public Restaurant restaurant;

    public RestaurantLightOff(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.lightOff();
    }

    @Override
    public void undo() {
        restaurant.lightOn();
        System.out.println("Undo Restaurant Light On");
    }
}
