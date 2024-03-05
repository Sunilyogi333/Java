import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Board extends JPanel implements MouseListener, MouseMotionListener {
    int preX, preY, newX, newY;

    Board() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        preX = e.getX();
        preY = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        newX = e.getX();
        newY = e.getY();
        Graphics2D g = (Graphics2D) getGraphics();
        g.drawLine(preX, preY, newX, newY);
        preX = newX;
        preY = newY;
    }

    public void mouseMoved(MouseEvent e) {
    }


}

public class DrawBoard {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(700, 700);
        f.setVisible(true);

        Board b = new Board();
        f.add(b);
    }
}