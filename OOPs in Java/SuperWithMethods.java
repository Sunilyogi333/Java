/*
2. usage of super with methods
- We can use super keyword to invoke parent class method if both parent and child
  class have a method with similar name.
*/
class Vehicle{
    void display(){
        System.out.println("I am a Vehicle");   
    }
}
class Bike extends Vehicle{
    void display(){
        super.display();
        System.out.println("I am a Bike");
    }
}
class SuperWithMethods{
    public static void main(String[] args){
        Bike b = new Bike();
        b.display();
    }
}