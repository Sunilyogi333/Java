class Person2{
    String name;
    int age;

    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Students extends Person{
    String department;
    int roll;

    Students(String name, int age, String department, int roll){
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
        Students S = new Students("Sunil", 21,"IT", 43 );
        S.display();
    }
}