package commandPattern.controller.stereo;

public class Stereo {

    private int volume;
    private String stereoName;

    public Stereo(String stereoName) {
        this.stereoName = stereoName;
    }

    public void on() {
        System.out.println("Stereo is On");
    }

    public void setCD() {
        System.out.println("Setting Cd");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("현재 볼륨은 : " + volume);

    }

    public void setDvd() {
        System.out.println("Setting Dvd");
    }

    public void setRadio() {
        System.out.println("Setting radio");
    }

    public void off() {
        System.out.println("Stereo is Off");
    }
}
