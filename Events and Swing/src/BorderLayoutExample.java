import javax.swing.*;
import java.awt.BorderLayout;
public class BorderLayoutExample extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;

    BorderLayoutExample(){
        btn1 = new JButton("EAST");
        btn2 = new JButton("WEST");
        btn3 = new JButton("NORTH");
        btn4 = new JButton("SOUTH");
        btn5 = new JButton("ENTER");

        setSize(400,400);
        setVisible(true);
        setLayout(new BorderLayout());

        add(btn1, BorderLayout.EAST);
        add(btn2, BorderLayout.WEST);
        add(btn3, BorderLayout.NORTH);
        add(btn4, BorderLayout.SOUTH);
        add(btn5, BorderLayout.CENTER);
    }
    public static void main(String[] args){
        new BorderLayoutExample();
    }
}
