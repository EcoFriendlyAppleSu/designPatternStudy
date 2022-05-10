package commandPattern.controller;

/**
 * command 객체를 상속받아 사용하는 객체라면 (implements) 변경 없이 사용 가능하다.
 * invoker class : 매개변수를 써서 여러 가지 요구 사항을 전달할 수도 있다.
 * 작업을 요청하는 invoker
 */
public class SimpleRemoteControl {

    public Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    /**
     * 작업 요청 method인 buttonWasPressed()
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
