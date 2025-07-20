import java.awt.*;
import java.awt.event.*;

public class Assignment810 extends Frame {
    public static void main(String[] args) {
        Assignment810 frame = new Assignment810();
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setLayout(new GridLayout(2, 2));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    
}
