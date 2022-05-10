package commandPattern.controller.light;

import commandPattern.controller.Command;

public class LightOffCommand implements Command {

    public Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();
    }
}
