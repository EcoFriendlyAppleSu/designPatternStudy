package commandPattern.cmdPractice.cmdClasses;

public interface Command {
    void execute();

    void undo(); // 마지막 작업이 취소가 되어야 한다.
}
