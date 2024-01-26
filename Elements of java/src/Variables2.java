public class Variables2{
    public static void main(String[] args){
        int a =10;
        double b= 20.5;
        String c = "Hello";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double sum = a+b;
        double mul = a*b;
        double div = a/b;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);

        b = 5;
        double left = a*b/a-b; //left to right
        double bracket= (a*b)/(a-b); //bracket first
        System.out.println(left);
        System.out.println(bracket);
    }
}