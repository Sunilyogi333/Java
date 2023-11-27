/*
this keyword
- this keyword is used to refer current class instance variable.
- It is used to differentiate instance variables from local variables 
  when they have the same name and to access methods or fields of the current object.
*/
//Example: condition where the use of this keyword is mandatory
class Student{
    int roll;
    String name;
    void Input(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Roll:"+ roll);
    }
    public static void main(String[] args){
        Student S = new Student();
        S.Input(43, "Sunil Nath");
        S.display();
    }
}