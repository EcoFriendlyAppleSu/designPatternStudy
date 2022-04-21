package decoratePattern;

/**
 * Decorator 추상 구성 요소
 */
public abstract class Beverage {

    public enum Size{ TALL, GRANDE, VENTI }
    public String description = "No title";
    Size size = Size.TALL;


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
        this.description += " ";
        this.description += size.name();
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
