import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    JButton btn1, btn2, btn3, btn4;

    GridLayoutExample() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");

        setSize(400, 400);

        setVisible(true);

        setLayout(new GridLayout(2, 2));

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
