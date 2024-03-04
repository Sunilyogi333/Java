//Create a Swing GUI that contains a button and Two Text fields. When the button is clicked, the value of first
// text field should be checked and display "odd Number" or "Even Number" in Second Text Field.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EvenOdd extends JFrame implements ActionListener {
    JButton btn;
    JTextField tf1,tf2;

    EvenOdd(){
        btn = new JButton("click me");
        tf1 = new JTextField();
        tf2 = new JTextField();

        //set layout of frame
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tf2.setEditable(false);

        //add components
        add(tf1);
        add(tf2);
        add(btn);

        // set bounds for components
        tf1.setBounds(50, 50, 150, 40);
        btn.setBounds(50, 100, 150, 40);
        tf2.setBounds(50, 150, 150, 40);

        //add listener
        btn.addActionListener(this);
    }
    //handle the event
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            int num = Integer.parseInt(tf1.getText());
            if(num%2==0){
                tf2.setText("Even Number");
            }
            else {
                tf2.setText("Odd Number");
            }
        }
    }

    public static  void main(String[] args){

        new EvenOdd();
    }
}
