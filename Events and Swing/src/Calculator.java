import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener{
JLabel lb1,lb2,lb3;
JTextField tf1,tf2,tf3;
JButton mul,add,div,sub;

Calculator(){
    setSize(500,500);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lb1 = new JLabel("First Number: ");
    tf1 = new JTextField();

    lb2 = new JLabel("Second Number: ");
    tf2 = new JTextField();

    lb3 = new JLabel("Result: ");
    tf3 = new JTextField();
    tf3.setEditable(false);


    mul = new JButton("*");
    add = new JButton("+");
    div = new JButton("/");
    sub = new JButton("-");

    add(lb1);
    add(lb2);
    add(lb3);
    add(tf1);
    add(tf2);
    add(tf3);
    add(mul);

    add(add);
    add(div);
    add(sub);
    lb1.setBounds(10,50,150,50);
    tf1.setBounds(180,50,150,50);
    lb2.setBounds(10,110,150,50);
    tf2.setBounds(180,110,150,50);
    lb3.setBounds(10,170,150,50);
    tf3.setBounds(180,170,150,50);

    mul.setBounds(10,300,50,50);
    add.setBounds(70,300,50,50);
    div.setBounds(130,300,50,50);
    sub.setBounds(190,300,50,50);

    mul.addActionListener(this);
    add.addActionListener(this);
    div.addActionListener(this);
    sub.addActionListener(this);

}
    public void actionPerformed(ActionEvent e){
    double num1 = Double.parseDouble(tf1.getText());
    double num2 = Double.parseDouble(tf2.getText());
    double result = 0;
    if(e.getSource() == mul){
        result = num1*num2;
    }
    if(e.getSource() == add){
            result = num1+num2;
        }
    if(e.getSource() == div){
            result = num1/num2;
        }
    if(e.getSource() == sub){
            result = num1-num2;
        }
    tf3.setText(Double.toString(result));
    }

    public static void main(String[] args){
    new Calculator();
    }
}

