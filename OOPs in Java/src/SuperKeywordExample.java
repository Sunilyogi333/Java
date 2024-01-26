class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    String department;
    int roll;

    Student(String name, int age, String department, int roll){
        super(name, roll);
        this.department = department;
        this.roll = roll;
    }
    void display(){
        System.out.println("Name: "+name+
                           "\nage: "+age+
                           "\nDepartment: "+department+
                           "\nRoll: "+roll);
    }
}
class SuperKeywordExample{
    public static void main(String[] args){
        Student S = new Student("Sunil", 21,"IT", 43 );
        S.display();
    }
}