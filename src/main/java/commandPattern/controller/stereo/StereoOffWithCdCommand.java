package commandPattern.controller.stereo;

import commandPattern.controller.Command;

public class StereoOffWithCdCommand implements Command {

    public Stereo stereo;

    public StereoOffWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
