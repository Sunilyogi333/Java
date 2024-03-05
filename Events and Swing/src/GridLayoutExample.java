import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5, btn6;

    GridLayoutExample() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");

        setSize(500, 500);
        setVisible(true);
        setLayout(new GridLayout(3,2));

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
