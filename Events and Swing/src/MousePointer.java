import javax.swing.*;
import java.awt.event.*;

public class MousePointer extends JFrame implements MouseListener {
    JTextField tf1,tf2;

    MousePointer(){
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf1 = new JTextField();
        tf2 = new JTextField();

        tf1.setEditable(false);
        tf2.setEditable(false);

        add(tf1);
        add(tf2);

        tf1.setBounds(50,50,150,50);
        tf2.setBounds(50,150,150,50);

        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){}

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){
        tf1.setText("Mouse Entered");
        int x = e.getX();
        int y = e.getY();
        tf2.setText("X: "+x+", Y: "+y);
    }
    public void mouseExited(MouseEvent e){
        tf1.setText("Mouse Exited");
        tf2.setText(" ");
    }

    public static void main(String[] args){
        new MousePointer();
    }
}
