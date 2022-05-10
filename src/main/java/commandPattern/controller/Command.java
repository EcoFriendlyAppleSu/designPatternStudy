package commandPattern.controller;

/**
 * command object interface
 */
public interface Command {

    void execute();

    void undo();

}
