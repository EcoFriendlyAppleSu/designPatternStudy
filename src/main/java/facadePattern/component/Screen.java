package facadePattern.component;

public class Screen {
    private int channel;

    public void on(int channel) {
        this.channel = channel;
        System.out.println("channel is " + channel);
    }
}
