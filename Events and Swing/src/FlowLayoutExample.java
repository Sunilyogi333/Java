import com.sun.nio.sctp.AbstractNotificationHandler;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    JButton btn1,btn2,btn3;

    FlowLayoutExample(){
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");

        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btn1);
        add(btn2);
        add(btn3);
    }
    public static void main(String[] args){
        new FlowLayoutExample();
    }
}
