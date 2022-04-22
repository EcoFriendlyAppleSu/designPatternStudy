package adaptorPattern.SimpleDuckProject;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("GobbleGoobllle");
    }

    @Override
    public void fly() {
        System.out.println("Can fly short way");
    }
}
