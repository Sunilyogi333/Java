/*
1. usage of super with variables
-We can use super keyword to access the data member of parent class if
 both parent and child class have same name for the data member.
 */
//Example:
class Vehicle2{
    int topspeed = 500;
}
class Bike3 extends Vehicle2{
    int topseed =200;
    
    void display(){
        System.out.println("Top speed of Bike is: "+super.topspeed);
        System.out.println("Top speed of Vehicle is: "+topspeed);
    }
}
public class SuperWithVariable {
    public static void main(String[] args){
        Bike3 b = new Bike3();
        b.display();
    }
}