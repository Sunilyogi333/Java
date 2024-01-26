/*
Multiple Inheritance
Multiple inheritance is not supported in Java due to ambiguity problem.
In multiple inheritance when one class is derived form two or more base classes then 
there might occure functions with same name in boht base classes. If the derived class object
needs to access one of the funtion then it will be ambiguous to the compiler to decide which
function to call. This is the reason why multiple inheritance is not supported in Java.
*/
class Base1{
    void write(){
        System.out.println("Base1");
    }
}
class Base2{
    void write(){
        System.out.println("Base2");
    }
}
class Derived2 extends Base2{
    void write(){
        System.out.println("Derived");
    }
}
class MultipleInheritance{
    public static void main(String[] args) {
        Derived2 dd = new Derived2();
        dd.write();
    }
}