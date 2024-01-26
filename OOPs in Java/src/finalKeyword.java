/*
final keyword
- The final keyword is used to denote that a particular element such as variable,
  method and class cannot be further modified, overridden or extended onces it has 
  been declared as final.
- The final keyword is used to restrict the user.
- The final keyword is used with theses elements:
  1. Variable
  2. Method
  3. Class
*/

/*

1.final variable
- If a variable is declared as final, then it can be assigned a value only once.
- If we make any varaible final, we cannot change it's value(constant).

  class Bike{
    final int speedlimit = 40; //final variable
    
    void run(){
        speedlimit = 60; //error , not allowed to change value
    }
  }

*/

/*

2. final method
- if we make any method final, then it cannot be overridden by subclasses.

 class Parent{
    final void display(){
        System.out.println("Parent class method");
    }
 }
 class child extends Parent{
    void display(){} //error, cannot override
 }

*/

/*
3. final class
- If we declare class as final then the class becomes IMMUTABLE i.e. we cannot extend it.

final class Parent{
}

class child extends Parent{} //error, cannot extend final class
*/