import javax.swing.*;
public class DialogBox {
    public static void main(String[] args) throws Exception{
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first Number","num1",JOptionPane.QUESTION_MESSAGE));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second Number","num2",JOptionPane.QUESTION_MESSAGE));
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum,"result",JOptionPane.INFORMATION_MESSAGE);
    }
}
