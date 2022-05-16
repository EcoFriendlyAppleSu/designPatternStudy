package facadePattern;

import facadePattern.component.Amplifier;
import facadePattern.component.Projector;
import facadePattern.component.Screen;
import facadePattern.component.Tuner;

public class HomeTheaterFacadeImpl implements HomeTheaterFacade{
    Amplifier amplifier;
    Tuner tuner;
    Projector projector;
    Screen screen;

    public HomeTheaterFacadeImpl() {
        this.amplifier = new Amplifier();
        this.tuner = new Tuner();
        this.projector = new Projector();
        this.screen = new Screen();
    }

    public HomeTheaterFacadeImpl(Amplifier amplifier, Tuner tuner, Projector projector, Screen screen) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.projector = projector;
        this.screen = screen;
    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("------- the theater is on ---------");
        amplifier.on();
        tuner.on();
        screen.on(17);
        projector.on();
    }

    @Override
    public void endMovie() {
        System.out.println("------- the theater is off ---------");
    }
}
