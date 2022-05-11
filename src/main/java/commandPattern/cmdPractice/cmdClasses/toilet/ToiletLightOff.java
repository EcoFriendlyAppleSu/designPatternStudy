package commandPattern.cmdPractice.cmdClasses.toilet;

import commandPattern.cmdPractice.cmdClasses.Command;

public class ToiletLightOff implements Command {

    public Toilet toilet;

    public ToiletLightOff(Toilet toilet) {
        this.toilet = toilet;
    }

    @Override
    public void execute() {
        toilet.lightOff();
    }

    @Override
    public void undo() {
        toilet.lightOn();
        System.out.println("Undo Toilet Light On");
    }
}
