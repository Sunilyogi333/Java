/*
Q.Make a class Human with name and age. Make a class Employee inherit from Human. 
Add instance variable of type double, supply method showData() that prints Employee's
name, age and Salary, Make a class manager inherit from employee. Supply showData()
method for all classes provide a test program that tests these classes and methods.(Constructor)
*/
class Human{
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    void showData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee3 extends Human{
    double salary;
    Employee3(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    } 
    void showData(){
            super.showData();
            System.out.println("Salary: "+salary);
        }
}
class Manager extends Employee3{
    Manager(String name, int age, double salary){
        super(name, age, salary);
    }
    void showData(){
        super.showData();
    }
    public static void main(String[] args){
        Manager m = new Manager("Sunil", 21, 10000);
        m.showData();
    }
}