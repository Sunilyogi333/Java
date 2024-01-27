import java.util.Scanner;
class CException extends Exception{
    CException(String str){
        super(str);
    }
}
public class CustomException2 {
    public static void main (String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        try{
            if(a<10){
                throw new CException("Custom Exception");
            }
            else {
                System.out.println("Integer: "+a);
            }
        }
        catch (CException e){
            System.out.println(e.getMessage());
        }
    }
}
