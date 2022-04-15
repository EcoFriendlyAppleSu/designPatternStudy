package abstractFactoryMethodPattern.factory;

import abstractFactoryMethodPattern.keyboard.LGKeyboard;
import abstractFactoryMethodPattern.keyboard.SSKeyboard;
import abstractFactoryMethodPattern.mouse.LGMouse;
import abstractFactoryMethodPattern.mouse.Mouse;
import abstractFactoryMethodPattern.mouse.SSMouse;

public class MouseFactory {
    public Mouse createMouse(String type) {
        switch (type) {
            case "LG":
                new LGMouse();
                break;
            case "SS":
                new SSMouse();
                break;
        }
        return null;
    }
}
