/*
Method Overloading:
If a class contain multiple method with similar name but different type of parameters then 
it is know as method overloading.
Method Overloading is not possible by changing only the return type.
*/
//For example:
class MethodOverloading{
    void add(int a, int b){
        System.out.println("Sum of two numbers is "+(a+b));
    }
    void add(float a, int b){
        System.out.println("Sum of two numbers is "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum of three numbers is "+(a+b+c));
    }
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);
        obj.add(10.5f, 20);
        obj.add(10, 20, 30);
    }
}

/*
NOTE:
In Java, when you use a decimal number literal without any suffix, like 10.5, it is treated as a double by default. This means that the data type of 10.5 is considered to be double. However, in your code, the method add(float a, int b) expects float argument, not double.

To pass a float literal, you need to add the f or F suffix to the number, like 10.5f or 10.5F. This tells Java that the number should be treated as a float literal.
*/