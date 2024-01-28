import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;

    BoxLayoutExample() {
        // Creating buttons
        btn1 = new JButton("btn1");
        btn2 = new JButton("btn2");
        btn3 = new JButton("btn3");
        btn4 = new JButton("long name");
        btn5 = new JButton("btn5");

        // Setting the size of the JFrame
        setSize(400, 400);

        // Setting the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the alignment of buttons
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn3.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn4.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn5.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Setting the layout manager to BoxLayout with Y_AXIS alignment
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Adding buttons to the JFrame
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        // Making the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Creating an instance of BoxLayoutExample
        new BoxLayoutExample();
    }
}
