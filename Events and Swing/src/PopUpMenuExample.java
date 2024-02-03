//Create a POP-UP menu attached to a frame. If you click within the area of a frame POP UP menu will be shown. When the
//menu item is clicked the message should be shown on label.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopUpMenuExample extends JFrame implements ActionListener,MouseListener {
    JLabel lb;
    JMenuItem M1, M2, M3;
    JPopupMenu PM;
    PopUpMenuExample(){
        //Set Frame
        setLayout(null);
        setVisible(true);
        setTitle("PopupMenu Example");
        setSize(500,500);

        //Create label
        lb = new JLabel();

        //Create popup menu
        PM = new JPopupMenu("Edit");

        //Create menu items
        M1 = new JMenuItem("Cut");
        M2 = new JMenuItem("Copy");
        M3 = new JMenuItem("Paste");

        //Add event listener
        PM.add(M1);
        PM.add(M2);
        PM.add(M3);

        //Add label to the frame
        add(lb);
        lb.setBounds(100,10,200,100);

        //Add event listener
        addMouseListener(this);
        M1.addActionListener(this);
        M2.addActionListener(this);
        M3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==M1){
            lb.setText("Cut is selected");
        }
        if(e.getSource()==M2){
            lb.setText("Copy is selected");
        }
        if(e.getSource()==M3){
            lb.setText("Paste is selected");
        }

    }

    public void mouseClicked(MouseEvent e){
        //Check if the right mouse button is clicked
        if(SwingUtilities.isRightMouseButton(e)){
            PM.show(this,e.getX(),e.getY());
        }
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public static void main(String[] args){
        new PopUpMenuExample();
    }
}
