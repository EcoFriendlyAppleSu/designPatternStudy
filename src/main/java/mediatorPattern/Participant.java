package mediatorPattern;

public abstract class Participant {
    public abstract void sendMessage(String msg);

    public abstract void setName(String name);

    public abstract String getName();

}// End of the Participant abstract class.
