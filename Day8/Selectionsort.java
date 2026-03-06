import java.util.*;
public class Selectionsort
{
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the minimum is the first element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    /*Selection Sort – Step by Step (Short Explanation)

Start from the first element of the array.

// ? Assume the first element is the minimum (minIndex = i).

Compare it with the remaining elements in the array.

// ? If a smaller element is found, update minIndex.

// TODOAfter checking all elements, swap the smallest element with the first unsorted element.

Move to the next position and repeat the process.

Continue until the entire array is sorted. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/*Selection Sort   repeatedly selects the smallest element from the unsorted portion of the array 
and places it at the beginning of the sorted portion. */
/*Key Idea:
Divide the array into two parts:

// ? Sorted part (left side)

// ? Unsorted part (right side)

// TODO In each iteration, the algorithm finds the minimum element from the unsorted part and swaps it with the first unsorted element, gradually building a sorted array. */

// ? TIME COMPLEXITY: O(n^2) in all cases (worst, average, and best) because it always requires two nested loops to complete the sorting process.