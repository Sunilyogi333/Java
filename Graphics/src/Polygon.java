import javax.swing.*;
import java.awt.*;
public class Polygon extends JPanel{
    public void paintComponent(Graphics g){
        //draw rectangle
        g.setColor(Color.green);
        g.fillRect(10,10,300,300);

        //draw a flag of Nepal
        int x[] = {20,20,90,50,90};
        int y[] = {20,80,80,50,40};
        g.setColor(Color.red);
        g.fillPolygon(x,y,5);

        //draw moon and sun
        g.setColor(Color.white);
        g.fillOval(30,55,10,10);
        g.fillArc(30,30,10,10,0,-180);
        g.drawString("My Nepal",30,100);
    }
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(600,600);
        f.setVisible(true);
        Polygon p = new Polygon();
        f.add(p);
    }
}
