/*
Function Overriding
Suppose a base class and derived classs has a member function with exactly same signature(name).
Now if call the function using object of derived class then the derived class function gets called.
This is known as function overriding.
*/
class Base{
    void display(){
        System.out.println("I am Base");
    }
}
class Derived extends Base{
    void display(){
        System.out.println("I am Derived");
    }
}
public class FunctionOverriding {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}