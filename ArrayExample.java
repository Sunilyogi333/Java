//WAP to delete an element from an array at specified position.
import java.util.Scanner;
import java.util.Arrays;

class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i, pos, n;
        System.out.println("Enter 10 array elements:");
        for (i = 0; i < 10; i++) {
            System.out.print("Enter element arr[" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position of element to be deleted:");
        pos = sc.nextInt();

        if (pos < 1 || pos > 10) {
            System.out.println("Invalid position. Element not deleted.");
        } else {
            for (i = pos - 1; i < 9; i++) {
                arr[i] = arr[i + 1];
            }

            // Resize the array
            arr = Arrays.copyOf(arr, 9);

            System.out.println("Array after deletion:");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

/*
In Java, arrays have a fixed size once they are created, and you cannot directly change their size. When you remove an element from an array, you typically create a new array with a smaller size (one less than the original) and copy the elements you want to keep from the old array to the new one. This effectively "resizes" the array in the sense that you have a new array with the desired size.

The old array still exists in memory, but it is no longer accessible from your program because you are now using the new smaller array. The old array becomes eligible for garbage collection, and the Java runtime system will eventually reclaim the memory used by the old array when it determines that there are no references to it.

So, while you don't directly delete the old array, you create a new smaller array to represent the resized data, and the old array will eventually be deallocated by the Java runtime. This process ensures that you are not wasting memory by keeping a larger array when you only need a smaller one.
*/

/*
In Java, when you use Arrays.copyOf or any other method to create a new array with a different size, a new block of memory is allocated for the new array. The new array is not allocated in the same location as the old array. The old array remains in its original memory location until it becomes eligible for garbage collection.

Here's what typically happens:

You have the old array in memory with its own memory location.
When you use Arrays.copyOf or any method to create a new array with a different size, a new block of memory is allocated for the new array.
The elements from the old array are copied to the new array.
The reference to the new array is assigned to the same variable name (in your case, arr), effectively replacing the reference to the old array.
The old array still exists in memory but is no longer accessible from your program. It becomes eligible for garbage collection, and the Java runtime system will eventually reclaim the memory used by the old array.
So, to summarize, the new array is allocated in a different memory location, and the old array remains in its original memory location until it is garbage collected.
*/

/*
Yes, when I mentioned that "the Java runtime system will eventually reclaim the memory used by the old array," I meant that the old memory allocation for the array will be deallocated or freed up after it becomes eligible for garbage collection.

In Java, memory management is handled automatically by the Java Virtual Machine (JVM). When an object, such as an array, is no longer referenced by any part of the program, it becomes eligible for garbage collection. The JVM's garbage collector is responsible for identifying and releasing the memory occupied by objects that are no longer in use.

Once an object is marked as eligible for garbage collection, the JVM will at some point (the exact timing is determined by the JVM's garbage collection algorithms) deallocate the memory occupied by that object. This process involves releasing the memory so that it can be reused for other objects in your program.

So, when I said that the memory is "reclaimed," I meant that it is deallocated and returned to the pool of available memory for future use by your program. This helps ensure efficient memory usage and prevents memory leaks.
*/