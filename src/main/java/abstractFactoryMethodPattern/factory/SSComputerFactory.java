package abstractFactoryMethodPattern.factory;

import abstractFactoryMethodPattern.keyboard.Keyboard;
import abstractFactoryMethodPattern.keyboard.SSKeyboard;
import abstractFactoryMethodPattern.mouse.Mouse;
import abstractFactoryMethodPattern.mouse.SSMouse;

public class SSComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new SSKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SSMouse();
    }
}
