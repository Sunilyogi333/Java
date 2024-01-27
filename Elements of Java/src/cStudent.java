/*
Constructor
- A Constructor is a special member function that is used to initialize the object.
- It does not have any return type.
- Constructor Overloading is  process  in which a class can have more than one constructor.
*/
class cStudent
{
    String name;
    int roll;
    cStudent(){

        name = "Sunil";
        roll = 43;
        System.out.println("Default Constructor\n");
    }
    cStudent(String name, int roll){
        this.name = name;
        this.roll = roll;
        System.out.println("Parameterized Constructor\n");
    }
    cStudent(cStudent S){
        name = S.name;
        roll = S.roll;
        System.out.println("Copy Constructor\n");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
    public static void main(String[] args){
        cStudent S1 = new cStudent();
        S1.display();
        cStudent S2 = new cStudent("Rahul", 45);
        S2.display();
        cStudent S3 = new cStudent(S2);
        S3.display();
    }
}
