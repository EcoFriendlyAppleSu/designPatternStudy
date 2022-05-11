package commandPattern.cmdPractice;

import commandPattern.cmdPractice.cmdClasses.Command;
import commandPattern.cmdPractice.cmdClasses.bookStore.BookStore;
import commandPattern.cmdPractice.cmdClasses.bookStore.BookStoreLightOff;
import commandPattern.cmdPractice.cmdClasses.bookStore.BookStoreLightOn;
import commandPattern.cmdPractice.cmdClasses.resturant.Restaurant;
import commandPattern.cmdPractice.cmdClasses.resturant.RestaurantLightOff;
import commandPattern.cmdPractice.cmdClasses.resturant.RestaurantLightOn;
import commandPattern.cmdPractice.cmdClasses.toilet.Toilet;
import commandPattern.cmdPractice.cmdClasses.toilet.ToiletLightOff;
import commandPattern.cmdPractice.cmdClasses.toilet.ToiletLightOn;

public class Client {

    public static void main(String[] args) {
        MultiRemoteController multiRemoteController = new MultiRemoteController();

        Toilet toilet = new Toilet("House Toilet");
        Restaurant restaurant = new Restaurant("Beef Restaurant");
        BookStore bookStore = new BookStore("CookBook");

        BookStoreLightOn bookStoreLightOn = new BookStoreLightOn(bookStore);
        BookStoreLightOff bookStoreLightOff = new BookStoreLightOff(bookStore);

        RestaurantLightOn restaurantLightOn = new RestaurantLightOn(restaurant);
        RestaurantLightOff restaurantLightOff = new RestaurantLightOff(restaurant);

        ToiletLightOn toiletLightOn = new ToiletLightOn(toilet);
        ToiletLightOff toiletLightOff = new ToiletLightOff(toilet);

        /**
         * commmand 인터페이스에 추상 메서드가 하나뿐일 때만 사용 가능
         */
        /*multiRemoteController.setOnCommands(0, ()-> bookStore.lightOn(), ()-> bookStore.lightOff());
        multiRemoteController.setOnCommands(1, ()-> restaurant.lightOn(), ()-> restaurant.lightOff());
        multiRemoteController.setOnCommands(2, () -> toilet.lightOn(), () -> toilet.lightOff());*/

        System.out.println(multiRemoteController);

        multiRemoteController.onButtonWasPushed(0);
        multiRemoteController.offButtonWasPushed(0);
        multiRemoteController.onButtonWasPushed(1);
        multiRemoteController.offButtonWasPushed(1);
        multiRemoteController.onButtonWasPushed(2);
        multiRemoteController.offButtonWasPushed(2);


    }
}
