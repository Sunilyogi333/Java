/*
static Keyword in Java

"The static keyword in Java is primarily used to define class-level members and behavior, ensuring that they are associated with the class itself rather than individual instances (objects). This allows for the creation of shared resources, such as variables and methods, that can be accessed and utilized without the need to create an instance of the class. Static members are useful for tasks where the data or functionality is common to all instances of the class and should not be duplicated for each object."

The static keyword in java is used for memory management. 
The characteristics of static keyword in java are:
i) static members are associated with class rather than object.
ii) static keyword is used with variables, methods, blocks and nested class.
iii) static method cannot be overridden but can be overloaded.
iv) static method cannpt access non-static data members and methods of a class.

1.Static Variables:
class Test{
    int a; //instance variable
    static int b; //static variable
}
- When a varaible declared static, a single copy of that variable is created and shared among all instance of 
a class.

2.Static Methods:
- When a method is declared static, it can be accessed without creating object of a class.
- static method can only access other static variable or methods of a class.

3.Static Block:
- static block is executed before main function when the class is loaded by the JVM.
- static block is used to initialize the static data member.
*/ 

//Notes:
/*
short explanations of characteristics statements are given below:

1.The static keyword in Java is used for memory management.
-Static members in Java are associated with the class itself rather than individual objects. However, the      
primary purpose of the static keyword is not memory management but rather defining class-level members.

-"class-level members" are variables and methods that are associated with the class itself rather than with individual instances (objects) of the class.

Class-Level Members:
i) Static Variables: Variables declared as static belong to the class rather than any specific instance of the class. They are shared among all instances of the class. Changes to a static variable affect all instances of the class.

ii) Static Methods: Methods declared as static are associated with the class and can be called without creating an instance of the class. They are often used for utility methods or for operations that don't depend on the state of any specific object.

- These class-level members are defined at the class level, meaning they exist as part of the class definition itself, and they are not tied to any particular object created from that class. Instead, they are shared resources that can be accessed using the class name.

For example, consider a class called MathUtils with a static method add:

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
- In this example, the add method is a class-level member because it's declared as static. You can call it as MathUtils.add(5, 3) without needing to create an instance of the MathUtils class. The add method is associated with the class itself, and its behavior is consistent across all calls because it doesn't depend on any specific instance's state.


2. Static members are associated with the class rather than objects.
-Static members, including static variables and methods, belong to the class and are shared among all instances (objects) of that class.

3. Static keyword is used with variables, methods, blocks, and nested classes.
- We use the static keyword with variables (static fields), methods (static methods), initialization blocks (static and instance initialization blocks), and nested classes (static nested classes).

4. static method cannot be overridden but can be overloaded.
-This statement is partially true. Static methods can be overloaded (i.e., you can define multiple static methods in a class with the same name but different parameters), but they cannot be overridden. Overriding is a concept related to instance (non-static) methods and polymorphism.

Static method cannot access non-static data members and methods of a class.
static methods can only access other static members (variables and methods) of a class directly. To access non-static (instance) members, you need an instance of the class.

for example:
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
- In this example, the add method is static, so it can be called as MathUtils.add(5, 3). The subtract method is not static, so you need to create an instance of the MathUtils class to call it:
*/