//Exception handling divide by zero
import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("The value of c is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured " + e);
        }
        System.out.println("End of the program");
    }
}
