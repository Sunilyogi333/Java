//WAP to generate a frame with 2 buttons Black and blue. When the button is clicked, the background color of them to
//change to respective colors.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class BlackBlue extends JFrame implements ActionListener {
    JButton btn1,btn2;

    BlackBlue(){
        btn1 = new JButton("black");
        btn2 = new JButton("Blue");

        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Set default close operation

        add(btn1);
        add(btn2);
        btn1.setBounds(50,50,100,100);
        btn2.setBounds(50,150,100,100);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            getContentPane().setBackground(Color.black);
        }
        if(e.getSource()==btn2){
            getContentPane().setBackground(Color.blue);
        }
    }
    public static void main(String[] args){
        new BlackBlue();
    }
}
