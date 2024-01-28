//Write a program to access private method of a class using reflection.
import java.lang.reflect.*;
class MyClass{
    private void display(){
        System.out.println("I am private display method");
    }
}
public class ReflectionExample2 {
    public static void main(String[] args) throws Exception{
        Class cs = Class.forName("MyClass");

        Method M = cs.getDeclaredMethod("display");
        Object obj = cs.newInstance();
        M.setAccessible(true);
        M.invoke(obj);
    }
}
