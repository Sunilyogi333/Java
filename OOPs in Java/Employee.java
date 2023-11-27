/*
Create a class Employee with id, name, post and salary. Create a parameterized Constructor to 
initialize a instance varaible. Override toString() method to display employee details.
*/
/*
Note: 
toString() method 
- If you want to represent any object as a string, toString() method comes into existence.
- The toString() method returns the String representation of the object.
- If you print any object, Java compiler internally invokes the toString() method on the object.
  So overriding the toString() method, returns the desired output, it can be the state of an object etc. 
  depending on your implementation.
- The primary purpose of toString() is to return a string that "textually represents" an object.

*/
class Employee{
    private int id;
    private String name;
    private String post;
    private double salary;

    Employee(int id, String name, String post, double salary){
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String toString(){
        return "Employee ID: " + id + "\n"+
        "Employee Name: " + name + "\n" +
        "Employee Post: " + post + "\n" +
        "Employee Salary: " + salary;
    }

    public static void main(String[] args){
        Employee e1 = new Employee(43, "Sunil", "Engineer", 50000);
        System.out.println(e1);
    }
}