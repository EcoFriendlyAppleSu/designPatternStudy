package commandPattern.cmdPractice.cmdClasses.resturant;

import commandPattern.cmdPractice.cmdClasses.Command;

public class RestaurantLightOn implements Command {

    public Restaurant restaurant;

    public RestaurantLightOn(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void execute() {
        restaurant.lightOn();
    }

    @Override
    public void undo() {
        restaurant.lightOff();
        System.out.println("Undo Restaurant Light On");
    }
}
