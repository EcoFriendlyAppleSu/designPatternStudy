package commandPattern.cmdPractice;

import commandPattern.cmdPractice.cmdClasses.Command;

public class RemoteController {

    public Command command;

    public RemoteController() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPress() {
        command.execute();
    }
}
