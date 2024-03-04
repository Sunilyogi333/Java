import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class MovableCircle extends JPanel implements ActionListener{
    JButton up, down, left, right;
    int ball_x= 50, ball_y= 50, ball_diameter= 100;
    MovableCircle(){
        up = new JButton("up");
        down = new JButton("down");
        left = new JButton("left");
        right = new JButton("right");

        add(up);
        add(down);
        add(left);
        add(right);

        up.addActionListener(this);
        down.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
    }

    public void paintComponent(Graphics g){
        //for default rendering
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(ball_x,ball_y,ball_diameter,ball_diameter);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== up){
            ball_y -=10;
        }
        else if(e.getSource()== down){
            ball_y +=10;
        }
        else if(e.getSource()== left){
            ball_x -=10;
        }
        else if(e.getSource()== right){
            ball_x +=10;
        }
        repaint();
    }
    public  static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(600,600);
        f.setVisible(true);
        MovableCircle m = new MovableCircle();
        f.add(m);
    }
}
