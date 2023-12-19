import java.util.*;
class MyException extends RuntimeException{
    public MyException(String str){
        super(str);
    }
}
class Self_Exception_Handling{
    public static void main(String[] args){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number greater than 20:");
        num=s.nextInt();
        try{
            if(num<20){
                throw new MyException("Abey aandha he kya ,number must be greater than 20.");
            }
            else{
                System.out.println("Num = "+num);
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}