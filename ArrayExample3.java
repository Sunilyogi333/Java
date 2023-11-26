/* Write a program with function that takes an array of integers as an argument
 and returns Sum of even numbers in that array. */
import java.util.*;
class ArrayExample3{
    int SumofEven(int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayExample3 obj = new ArrayExample3();
        int sum = obj.SumofEven(arr, n);
        System.out.println("Sum of even numbers in the array is: "+sum);
    }
}