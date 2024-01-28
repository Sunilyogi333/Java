import java.lang.reflect.*;
class Student2{
    private int roll;
    private String name;

    public Student2(){
        roll = 43;
        name= "sunil";
    }
    public Student2(String name, int roll){
        this.name= name;
        this.roll = roll;
    }
    public void display(){
        System.out.println("Hello everyone, Myself "+name+". My roll number is: "+roll);
    }
}
public class ReflectionExample1 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Student2");
        Constructor cons[] = c.getDeclaredConstructors();

        for(Constructor con: cons){
            System.out.println(con);
        }

        Method mths[] = c.getDeclaredMethods();

        for(Method mth: mths){
            System.out.println(mth);
            mth.setAccessible(true);
        }
    }
}
