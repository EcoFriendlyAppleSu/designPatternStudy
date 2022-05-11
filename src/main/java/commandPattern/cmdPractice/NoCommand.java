package commandPattern.cmdPractice;

import commandPattern.cmdPractice.cmdClasses.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
