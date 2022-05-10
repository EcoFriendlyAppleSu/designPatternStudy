package commandPattern;

import commandPattern.controller.Command;
import commandPattern.controller.RemoteControl;
import commandPattern.controller.garage.GarageDoor;
import commandPattern.controller.garage.GarageDoorCloseCommand;
import commandPattern.controller.garage.GarageDoorOpenCommand;
import commandPattern.controller.light.Light;
import commandPattern.controller.light.LightOffCommand;
import commandPattern.controller.light.LightOnCommand;
import commandPattern.controller.stereo.Stereo;
import commandPattern.controller.stereo.StereoOffWithCdCommand;
import commandPattern.controller.stereo.StereoOnWithCdCommand;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchen = new Light("kitchen");
        GarageDoor garage = new GarageDoor("garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(kitchen);
        LightOffCommand lightOffCommand = new LightOffCommand(kitchen);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garage);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffWithCdCommand stereoOffWithCdCommand = new StereoOffWithCdCommand(stereo);


        remoteControl.setOnCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setOnCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setOnCommand(2, stereoOnWithCdCommand, stereoOffWithCdCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.undoButtonWasPushed();

    }
}
