import javax.swing.*;
import java.awt.*;
public class Diagram extends JPanel{
    public void paintComponent(Graphics g){
        String label[] = {"Java","C","C++"};
        int data[] = {50,30,40};
        for(int i=0; i<3; i++){
            g.setColor(Color.black);
            g.drawString(label[i],10,20+i*50);
            g.setColor(Color.red);
            g.fillRect(50,10+i*50,data[i],10);
        }
    }
    public static void main(String[] args){
        Frame f = new Frame();
        Diagram d = new Diagram();
        f.setSize(400,400);
        f.setVisible(true);
        f.add(d);
    }
}
