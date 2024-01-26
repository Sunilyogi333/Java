/*
Multiple Inheritance
- It is a process in which a derived class is inherited from base class which in turn is derived 
  from anther bases classes.
*/
class Animal{
    void eat(){
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}
class BabyDog extends Dog{
    void sleep(){
        System.out.println("BabyDog is sleeping.");
    }
}
class MultilevelInheritance{
    public static void main(String args[]){
        BabyDog b = new BabyDog();
        b.eat();
        b.bark();
        b.sleep();
    }
}