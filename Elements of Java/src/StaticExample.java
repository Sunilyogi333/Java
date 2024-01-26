class StaticExample{
    //static variable
    static int static_var = 20;

    //static block
    static{
        System.out.println("This is Static block");
        System.out.println("The value of static variable: " + static_var);
        static_var = 30;
    }

    //static method
    public static void staticMethod(){
        System.out.println("This is Static method");
        System.out.println("The value of static variable: " + static_var);
    }

    public static void main(String[] args){
        System.out.println("This is main method");
        System.out.println("The value of static variable: " + static_var);
        staticMethod();
    }
}