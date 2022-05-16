package facadePattern;

public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacadeImpl();
        homeTheaterFacade.watchMovie("joker!");

    }
}
