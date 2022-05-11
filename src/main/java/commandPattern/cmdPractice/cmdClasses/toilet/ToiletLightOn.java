package commandPattern.cmdPractice.cmdClasses.toilet;

import commandPattern.cmdPractice.cmdClasses.Command;

public class ToiletLightOn implements Command {

    public Toilet toilet;

    public ToiletLightOn(Toilet toilet) {
        this.toilet = toilet;
    }

    @Override
    public void execute() {
        toilet.lightOn();
    }

    @Override
    public void undo() {
        toilet.lightOff();
        System.out.println("Undo Toilet Light Off");
    }
}
