//Create a frame with one button and one text field when the button is clicked the text input should be changed to uppercase
//and color text field must be changed to blue
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class UppercaseAndColor extends JFrame implements ActionListener {
    JButton btn;
    JTextField txt;

    UppercaseAndColor(){
        btn = new JButton("click");
        txt = new JTextField();

        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(btn);
        add(txt);
        btn.setBounds(50,50,100,100);
        txt.setBounds(50,150,100,100);

        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn) {
            String str = txt.getText();
            String uppercase = str.toUpperCase();
            txt.setText(uppercase);
            txt.setBackground(Color.BLUE);
        }
    }
    public static void main(String[] args){
        new UppercaseAndColor();
    }
}
