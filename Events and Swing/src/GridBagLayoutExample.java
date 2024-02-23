import java.awt.*;
import javax.swing.*;
public class GridBagLayoutExample extends JFrame{
    JButton btn1, btn2,btn3, btn4;

    GridBagLayoutExample(){
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");

        setSize(500,500);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(btn1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(btn2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(btn3,gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 2;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(btn4,gbc);
    }
    public static void main(String[] args){
        new GridLayoutExample();
    }
}
