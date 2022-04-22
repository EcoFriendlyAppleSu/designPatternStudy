package decoratePattern.practice;

public abstract class Drink {

    public String menuInfo;
    public enum Size{TALL, GRANDE, VENTI}

    Size size = Size.TALL; //default value

    public String getMenuInfo() {
        return menuInfo;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
        this.menuInfo += " ";
        this.menuInfo += size.name();

    }

    public abstract double cost();
}
