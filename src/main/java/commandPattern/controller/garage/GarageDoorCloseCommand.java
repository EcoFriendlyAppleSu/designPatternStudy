package commandPattern.controller.garage;

import commandPattern.controller.Command;

public class GarageDoorCloseCommand implements Command {

    public GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
