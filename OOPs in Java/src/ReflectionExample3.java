//Write a program in java to access private Constructor, private Field, private Method using reflection API.
import java.lang.reflect.*;
class MyClass3{
    private String str = "Private Field";
    private MyClass3() {
        System.out.println("Constructor");
    }
    private void display(){
        System.out.println("I am Private display");
    }
}
public class ReflectionExample3 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("MyClass3");

        Field fld = cls.getDeclaredField("str");
        fld.setAccessible(true);

        Constructor C = cls.getDeclaredConstructor();
        C.setAccessible(true);

        Method Mth = cls.getDeclaredMethod("display");
        Mth.setAccessible(true);

        Object obj = C.newInstance();
        Mth.invoke(obj);
    }
}
