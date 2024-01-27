import java.util.*;
class MyException2 extends Exception{
    public MyException2(String str){
        super(str);
    }
}
public class DivideByZero {
    public static  void main (String[] args){
        int num1, num2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter numerator:");
        num1 = Sc.nextInt();
        System.out.println("Enter denominator:");
        num2 = Sc.nextInt();

        try{
            if(num2==0){
                throw new MyException2("Number Should not be zero");
            }
            else{
                System.out.println("Result:"+(num1/ num2));
            }
        }
        catch (MyException2 e){
            System.out.println(e.getMessage());
        }
    }
}
