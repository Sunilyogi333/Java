import java.util.*;
class ExceptionExample1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
        }
        catch(RuntimeException e){
            System.out.println("Cannot perform task");
            System.out.println(e.getMessage());
        }
    }
}