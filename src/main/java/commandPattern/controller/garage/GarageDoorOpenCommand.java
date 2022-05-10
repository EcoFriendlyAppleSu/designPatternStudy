package commandPattern.controller.garage;

import commandPattern.controller.Command;

public class GarageDoorOpenCommand implements Command {

    public GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();

    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
