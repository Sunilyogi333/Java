//Final keyword example with all the elements
class Bike {
    final int speedlimit = 40; //final variable
    final void display(){
        System.out.println("Bike's speedlimit is: "+speedlimit);
    }
}
class Cycle extends Bike{
    /* 
    speedlimit = 60;    //error, cannot change value of final variable

     void display(){    //error, cannot override final method
         System.out.println("Cycle's speedlimit is: "+speedlimit);
     }
     */
}

class finalKeywordExample{
    public static void main(String[] args){
        Cycle c = new Cycle();
        c.display();
    }
}