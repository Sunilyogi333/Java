/*
Multiple Inheritance
- It is a process in which a derived class is inherited from base class which in turn is derived 
  from another bases classes.
*/
class Animals2{
    void eat(){
        System.out.println("Animal is eating.");
    }
}
class Dogs extends Animals{
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