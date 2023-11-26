//Write a program input 10 array elements and delete xth element from the array.
import java.util.*;
class ArrayExample2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i, j, x;
        System.out.println("Enter 10 array elements:");
        for(i=0; i<10; i++){
            System.out.print("Enter element arr["+(i+1)+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position of element to be deleted: ");
        x = sc.nextInt();
        for(i=x-1; i<9; i++){
            arr[i]=arr[i+1];
        }
        System.out.println("Array after deletion:");
        for(i=0; i<9; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}