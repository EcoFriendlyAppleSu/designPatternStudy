package abstractFactoryMethodPattern.factory;

import abstractFactoryMethodPattern.keyboard.Keyboard;
import abstractFactoryMethodPattern.keyboard.LGKeyboard;
import abstractFactoryMethodPattern.mouse.LGMouse;
import abstractFactoryMethodPattern.mouse.Mouse;

public class LGComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
