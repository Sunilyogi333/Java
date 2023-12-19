//write a program to write a custom exception
import java.util.Scanner;

class MyException extends RuntimeException {
    MyException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        try {
            if (n < 10) {
                throw new MyException("Number is less than 10");
            } else {
                System.out.println("Number is greater than 10");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
