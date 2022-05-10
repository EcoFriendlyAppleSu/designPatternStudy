package commandPattern.simpleRemoteControllerTest;

import commandPattern.controller.RemoteControl;
import commandPattern.controller.fan.CeilingFan;
import commandPattern.controller.fan.CeilingFanHighCommand;
import commandPattern.controller.fan.CeilingFanMediumCommand;
import commandPattern.controller.fan.CeilingFanOffCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(); // invoker

        CeilingFan living_room = new CeilingFan("living Room"); // 작업을 처리하는 receiver

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(living_room);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(living_room);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(living_room);

        remoteControl.setOnCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setOnCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
