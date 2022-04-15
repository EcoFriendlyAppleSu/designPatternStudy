package abstractFactoryMethodPattern.factory;

import abstractFactoryMethodPattern.keyboard.Keyboard;
import abstractFactoryMethodPattern.keyboard.LGKeyboard;
import abstractFactoryMethodPattern.keyboard.SSKeyboard;

public class KeyboardFactory {
    public Keyboard createKeyboard(String type) {
        switch (type) {
            case "LG":
                new LGKeyboard();
                break;
            case "SS":
                new SSKeyboard();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return null;
    }
}
