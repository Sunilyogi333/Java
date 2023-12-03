/*
--> Abstract Classes and Methods
- Data abstraction is the process of hiding certain details and showing only essential  information to the user.
- Abstraction can be achieved with either abstract classes or interfaces.

- The abstract keyword is a non-access modifier, used for classes and methods:

- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

- Abstract method: can only be used in an abstract class, and it does not have a body.  The body is provided by the subclass (inherited from).
- An abstract class can have both abstract and regular methods:
 */
//Example
abstract class Shape{
    public void display(){
        System.out.println("I am abstract class");
    }
    public abstract void area(); // abstract method
}

class Rectangle extends Shape{
    private float length;
    private float breadth;

    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void area(){
        System.out.println("Area of rectangle is: " + length * breadth);
    }
}
class Abstraction{
    public static void main(String[] args){
        Rectangle r = new Rectangle(5,10);
        r.display();
        r.area();
    }
}
