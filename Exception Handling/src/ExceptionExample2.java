import java.util.*;

class SunilException extends Exception{
    SunilException(String message){
        super(message);
    }
}

class ExceptionExample2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(num < 0){
                throw new SunilException("Negative number not allowed");
            }
        }
        catch(SunilException e){
            System.out.println(e.getMessage());
        }
    }
}