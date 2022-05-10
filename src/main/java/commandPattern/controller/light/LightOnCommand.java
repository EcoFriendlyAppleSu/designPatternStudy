package commandPattern.controller.light;

import commandPattern.controller.Command;

/**
 * command class implements Command interface
 * command 객체로 제어할 정보를 구성으로 입력
 * 작업을 처리하는 receiver
 */
public class LightOnCommand implements Command {

    public Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
