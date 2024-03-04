import javax.swing.*;
import java.awt.*;
public class Ellipse extends JPanel{
    public void paintComponent(Graphics g){
        //draw ellipse
        g.setColor(Color.BLACK);
        g.drawOval(50,50,250,150);

        //set font
        Font ft = new Font("Times new Roman",Font.BOLD, 20);
        g.setFont(ft);

        g.drawString("Pokhara University", 100,150);
    }
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setVisible(true);
        Ellipse e = new Ellipse();
        f.add(e);
    }
}
