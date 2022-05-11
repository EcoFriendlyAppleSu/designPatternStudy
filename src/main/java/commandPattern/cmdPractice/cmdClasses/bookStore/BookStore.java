package commandPattern.cmdPractice.cmdClasses.bookStore;

public class BookStore {

    private String name;

    public BookStore(String name) {
        this.name = name;
    }

    public void lightOn() {
        System.out.println("BookStore Light is on " + this.name);
    }

    public void lightOff() {
        System.out.println("BookStore Light is off " + this.name);
    }
}
