class Address{
    String Zone, district, city;
    Address(String Zone, String district, String city){
        this.Zone = Zone;
        this.district = district;
        this.city = city;
    }

    void display(){
        System.out.println("Zone: " + Zone + "\nDistrict: " + district + "\nCity: " + city);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void display(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Employee extends Person{
    String department;
    Address add; // Composition

    Employee(String name, int age, String department, Address add){
        super(name, age);
        this.department = department;
        this.add = add;
    }

    void display(){
        super.display();
        add.display();
        System.out.println("Department: " + department);
    }
}

class CompositionInheritance{
    public static void main(String[] args){
        Address add = new Address("Bagmati", "Kathmandu", "Kathmandu");
        Employee E = new Employee("Sunil", 21, "IT", add);
        E.display();
    }
}

