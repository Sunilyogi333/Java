import  java.awt.*;
import javax.swing.*;
public class PieChart extends JPanel{
    public void paintComponent(Graphics g){
        int data[] = {40,30,20,10};
        Color data_clr[] = {Color.red, Color.blue, Color.green, Color.yellow};

                int total = 100;
        int start_angle = 0;
        for(int i=0; i<data.length; i++){
            int arc_angle = (int)(data[i]*360/total);
            g.setColor(data_clr[i]);
            g.fillArc(100,100,300,300, start_angle,arc_angle);
            start_angle= start_angle+arc_angle;
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        PieChart p = new PieChart();
        f.add(p);
    }
}
