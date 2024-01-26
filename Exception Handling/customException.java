//Write a program to create a custom exception called InvalidAgeException. If the user enters age below 18, throw the exception.
//The message should be "You are not eligible to vote". If the user enters age above 60, throw the exception.
//The message should be "You are too old to vote".
//If the user enters age between 18 and 60, then display "You are eligible to vote".

import java.util.Scanner;

class InvalidAgeException extends Exception {
     public InvalidAgeException(String s) {
        super(s);
    }
}

public class customException {
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        
        try {
            int age = sc.nextInt();
            
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible to vote");
            } else if (age > 60) {
                throw new InvalidAgeException("You are too old to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid age as a number.");
        } finally {
            sc.close();
        }
    }
}
