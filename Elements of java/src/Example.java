//Hello world program
public class Example {
    public static void main(String[] args) {
        System.out.println("Hello world, we are learning Java");
    }
}
/*
    public: access modifier
    This access specifier makes main funciton accessible to other classes
    static: keyword
    i. main method should be declared static so that the JVM can call without creating instance of a class.
    ii. If the main method is not declared as static, then the JVM has to create object of a class
    because the constructor might be overloaded and include arguments. There is will be no any 
    consistent and reliable way for the JVM to find main method.

    void: return type
    This specify that the method does not return any value.

    main: method name
    This is the keyword used to declare  main fucntion.
    This method name is searched by JVM as a starting point for an application with a particular signature only.

    String[] args: parameter
    This is the parameter passed to the main method to accept array of string.
    These are command line arguments that can be passed for running the program.

    System.out.println: statement
    This is used to print the string on the console.

    To run this program in terminal
    javac Example.java     // to compile
    java Example          // to run
 */