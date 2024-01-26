/*

Interface
- Interface is a fully abstract class.
- Interface is used to achieve full abstraction.
- Interface is used to achieve multiple inheritance.
- It can contain static constant and abstract method.
- Interface cannot be extended but implemented by a class.

 */
interface Area{
    public abstract void findArea();
}

interface Perimeter{
    public abstract void findPerimeter();
}

class Rectangle implements Area, Perimeter{
    float length, breadth;
    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void findArea(){
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    public void findPerimeter(){
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
}

class InterfaceExample{
    public static void main(String[] args){
        Rectangle r = new Rectangle(10, 20);
        r.findArea();
        r.findPerimeter();
    }
}