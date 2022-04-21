package observerPattern;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Do or not?");
        button.addActionListener(e ->
                System.out.println("Don't do that"));
        button.addActionListener(e ->
                System.out.println("Just Do it"));
    }
}
