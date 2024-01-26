/*
1. usage of super with variables
-We can use super keyword to access the data member of parent class if
 both parent and child class have same name for the data member.
 */
//Example:
class Vehicle{
    int topspeed = 500;
}
class Bike extends Vehicle{
    int topseed =200;
    
    void display(){
        System.out.println("Top speed of Bike is: "+super.topspeed);
        System.out.println("Top speed of Vehicle is: "+topspeed);
    }
}
public class SuperWithVaraible {
    public static void main(String[] args){
        Bike b = new Bike();
        b.display();
    }
}