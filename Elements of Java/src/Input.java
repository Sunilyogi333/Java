// Purpose: To take in user input
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");
        String Name = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + Name); // Output user input

        System.out.println("Enter age");
        int Age = myObj.nextInt(); // Read user input
        System.out.println("Age is: " + Age); // Output user input

        System.out.println("Enter salary");
        double Salary = myObj.nextDouble(); // Read user input
        System.out.println("Salary is: " + Salary); // Output user input
    }
}

/*
Java User Input(Scanner)
Scanner Methods:
nextBoolean()	-Reads a boolean value from the user
nextByte()	    -Reads a byte value from the user
nextDouble()	-Reads a double value from the user
nextFloat()	    -Reads a float value from the user
nextInt()	    -Reads a int value from the user
nextLine()	    -Reads a String value from the user
nextLong()	    -Reads a long value from the user
nextShort()	    -Reads a short value from the user

--> All the methods listed above are provide by the 'java.util.Scanner' class. You can use these methods to read input from the user and store them in variables.
*/

/*
1) import java.util.Scanner;  // Import the Scanner class
 - is an import statement in Java. It is used to make classes and packages from the java.util package, specifically the Scanner class, accessible in your Java code.

i) import: This keyword is used to declare an import statement in Java.

ii) java.util: This is the package name. Packages are used to organize classes and other code elements in Java. java.util is a standard Java package that contains various utility classes, including the Scanner class.

iii) Scanner: This is the class name that you want to import from the java.util package. In this case, you're importing the Scanner class.

- When you include this import statement at the beginning of your Java file, it allows you to use the Scanner class without having to specify its full package name every time you reference it in your code.
  For example, instead of writing:
  java.util.Scanner obj = new java.util.Scanner(System.in);,

  you can simply write:
  Scanner obj = new Scanner(System.in);.

--> Import statements are a way to simplify your code and make it more readable by providing easy access to classes and packages that you intend to use in your Java program.
*/

/*
2) Scanner myObj = new Scanner(System.in);
The new keyword is used to create a new instance of the Scanner class.

i) Scanner 
- is a class in Java that is used for reading input from various sources, such as the keyboard (System.in in this case).
- It is part of the java.util package, which is included in the Java standard library.


ii) System.in 
- is an InputStream object that represents the standard input stream, typically connected to the keyboard for reading user input.

iii) new Scanner(System.in) 
- is an expression that creates a new instance of the Scanner class, specifically configured to read input from the standard input stream (System.in).

--> So, when you write new Scanner(System.in), you're creating a new Scanner object that you can use to read input from the keyboard or any other input source you specify. This is a common pattern in Java for creating instances of classes using the new keyword.

Also
- 'myObj' is the name of the Scanner object that you're creating. You can name it anything you want, but it's a good practice to give it a descriptive name that indicates what it's used for.

- 'myObj' is the name you've chosen for the object that you are creating.

- 'new Scanner(System.in)' creates a new instance of the 'Scanner' class and assigns it to the variable 'myObj'.

--> After this line of code, you can use the 'myObj' object to interact with the 'Scanner' class's methods to read input from the standard input stream (System.in) as demonstrated in the example.

*/