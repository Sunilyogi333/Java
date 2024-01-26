/* 
Getter and Setter in Java

- Getter in Java is used to return the value of a private field.
- Setter in Java is used to set the value of a private field.
- Getter and Setter are also known as Accessor and Mutator in Java.
- Getter and Setter in Java are used to encapsulate a field by making 
  it accessible  only through its public methods and keep the values 
  themselves private.

*/ 

class Student{
    private String name;
    private int roll;

    //setter for name
    public void setName(String name){
        this.name=name;
    }

    //getter for name
    public String getName(){
        return name;
    } 

    //setter for roll
    public void setRoll(int roll){
        this.roll = roll;
    }

    //getter for roll
    public int getRoll(){
        return roll;
    }
}
class GetterSetter{
    public static void main(String[] args){
        Student S = new Student();
        S.setName("Sunil Nath");
        S.setRoll(43);
        System.out.println("Name: "+ S.getName() + "\nRoll: "+ S.getRoll());
    }
}