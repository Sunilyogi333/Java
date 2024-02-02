import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HelloWorldBtn extends Frame implements ActionListener {
    Button btn;
    TextField tf;
    HelloWorldBtn(){
        btn = new Button("click me");
        tf = new TextField();

        setLayout(null);
        setVisible(true);
        setSize(500,500);

        add(btn);
        add(tf);
        btn.setBounds(50,50,100,50);
        tf.setBounds(50,150,100,50);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() ==btn){
            tf.setText("Hello World");
        }
    }
    public static void main(String[] args){
        new HelloWorldBtn();
    }
}
