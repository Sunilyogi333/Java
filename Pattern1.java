/*Write a program to print the following pattern:

* 
* *
* * *
* * * *
* * * * *

*/
import java.util.*;
class Pattern1{
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}