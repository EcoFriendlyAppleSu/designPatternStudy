package abstractFactoryMethodPattern.factory;

import abstractFactoryMethodPattern.keyboard.Keyboard;
import abstractFactoryMethodPattern.mouse.Mouse;

public interface ComputerFactory {

    Keyboard createKeyboard();

    Mouse createMouse();
}
