package commandPattern.controller;

/**
 * command 객체 init 시 null class 를 초기에 집어 넣어 아무 일도 발생하지 않게 조치
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
