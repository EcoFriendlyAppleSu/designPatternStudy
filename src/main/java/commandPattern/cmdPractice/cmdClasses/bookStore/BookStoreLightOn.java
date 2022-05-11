package commandPattern.cmdPractice.cmdClasses.bookStore;

import commandPattern.cmdPractice.cmdClasses.Command;

public class BookStoreLightOn implements Command {

    public BookStore bookStore;

    public BookStoreLightOn(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void execute() {
        bookStore.lightOn();
    }

    @Override
    public void undo() {
        bookStore.lightOff();
        System.out.println("Undo BookStore Light On");
    }
}
