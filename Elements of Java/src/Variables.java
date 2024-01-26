// Purpose: Holds all the variables for the program
public class Variables {
    float instance_var = 1.0f; // instance variable
    static int static_var = 1; // static variable
    public static void main(String[] args) {
        int local_var = 1; // local variable
        System.out.println("local_var: " + local_var);
        System.out.println("static_var: " + static_var);
        Variables v = new Variables();
        System.out.println("instance_var: " + v.instance_var);
    }
}

/* 
Types of Variable
1.local variable
    - declared inside the method
    - scope is limited to the method
    - must be initialized before use

2.static variable
    - declared inside the class but outside the method, constructor or block
    - declared by using the keyword static
    - scope is limited to the class
    - can be accessed directly by the class name
    - must be initialized before use

3.instance variable
    - declared inside the class but outside the method, constructor or block
    - scope is limited to the class
    - must be initialized before use
    - can be accessed only by creating objects
*/