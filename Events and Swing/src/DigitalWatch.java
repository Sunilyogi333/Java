import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalWatch extends JFrame {
    SimpleDateFormat timeFormat;
    JLabel label;
    String time;

    public DigitalWatch(){
        setSize(500,500);
        label = new JLabel();
        setResizable(false);

        label.setBackground(Color.BLACK);
        label.setForeground(Color.green);
        label.setOpaque(true);

        timeFormat = new SimpleDateFormat("hh.mm.ss");

        setLayout(new FlowLayout());
        add(label);
        setVisible(true);
        setTime();
    }
    public void setTime(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            label.setText(time);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
        }
    public static  void main(String[] args){
        new DigitalWatch();
    }
}
