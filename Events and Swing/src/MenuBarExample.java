//WAP to create menu Bar. The menu Bar should contain two menus (File and Help). File menu should contain menu items
//"Open" and "close". Also handle the event to display a dialogue Box "Exiting From Program" when we click menu item close.
import javax.swing.*;
import java.awt.event.*;
public class MenuBarExample extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file,help;
    JMenuItem open,close;
    MenuBarExample(){
        mb = new JMenuBar();
        file = new JMenu("file");
        help = new JMenu("help");

        open = new JMenuItem("Open");
        close = new JMenuItem("close");

        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when clicking the close button

        file.add(open);
        file.add(close);
        mb.add(file);
        mb.add(help);

        setJMenuBar(mb);
        close.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==close){
            int a = JOptionPane.showConfirmDialog(mb,"Exiting From Program","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
            if(a==JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }

    }
    public static void main(String[] args){
        new MenuBarExample();
    }

}
