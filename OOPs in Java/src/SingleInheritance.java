/*
--> Single Inheritance
- In this type of inheritance, one derived class is inherited from one base class.
*/
class Animals{
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
class SingleInheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}