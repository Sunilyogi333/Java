//Wap to check Odd/Even using function.
import java.util.Scanner;
class OddEven{
    public boolean check(int a){
        if(a%2==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String[] args){
        OddEven obj = new OddEven();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(obj.check(a))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}