package abstractFactoryMethodPattern.factory;

public class FactoryOfComputerFactory{
    public void createComputer(String type) {
        ComputerFactory computerFactory = null; // kind of message send
        switch (type) {
            case "LG":
                computerFactory = new LGComputerFactory();
                break;
            case "SS":
                computerFactory = new SSComputerFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        computerFactory.createMouse();
        computerFactory.createKeyboard();
    }
}
