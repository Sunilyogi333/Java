/*
Hirarchical Inheritance
- In this type of inheritance, more than one sub class extends the same base class.

Example: Write a code animal as a base class and dog and cow as a derived classes.
Write a method eat() in animal class and override this method in all derived classes.
*/
class Animal {
    public void eat() {
        System.out.println("Animal is Eating.");
    }
}
class cat extends Animal {
    public void eat() {
        System.out.println("Cat is eating.");
    }
}
class cow extends Animal {
    public void eat(){
        System.out.println("Cow is eating.");
    }
}
class HiarchicalInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        cat c = new cat();
        c.eat();
        cow d = new cow();
        d.eat();
    }
}