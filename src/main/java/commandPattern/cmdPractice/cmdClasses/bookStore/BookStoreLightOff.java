package commandPattern.cmdPractice.cmdClasses.bookStore;

import commandPattern.cmdPractice.cmdClasses.Command;

public class BookStoreLightOff implements Command {

    public BookStore bookStore;

    public BookStoreLightOff(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void execute() {
        bookStore.lightOff();
    }

    @Override
    public void undo() {
        bookStore.lightOn();
        System.out.println("Undo BookStore Light Off");
    }
}
