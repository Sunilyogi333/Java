import javax.swing.*;
import java.awt.*;
public class Square extends JPanel{
    public void paintComponent(Graphics g){
        //draw square
        g.setColor(Color.red);
        g.fillRect(50,50,200,200);

        //draw circle
        g.setColor(Color.green);
        g.fillOval(80,80,50,50);

        g.drawString("All the best",70,70);
    }
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(600,600);
        f.setVisible(true);
        Square sq = new Square();
        f.add(sq);
    }
}
