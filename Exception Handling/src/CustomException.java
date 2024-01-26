//write a program to write a custom exception
import java.util.Scanner;
import java.lang.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

