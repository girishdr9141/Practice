import java.util.*;
public class BubbleSort
{
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        //why n-1 because we are comparing arr[j] and arr[j+1], so we need to stop at n-1 to avoid out of bounds error
        {
            for (int j = 0; j < n - i - 1; j++)
            //why n-i-1 because after each pass, the largest element is bubbled to the end of the array, so we can ignore the last i elements which are already sorted
            {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
/*Bubble Sort – Step by Step (Short Explanation)

Start with the first element of the array.

// TODO Compare adjacent elements (arr[j] and arr[j+1]).

// TODO Swap them if the left element is greater than the right element.

Continue comparing the next pairs in the array.

// ? After one full pass, the largest element “bubbles up” to the last position.

Repeat the process for the remaining unsorted part (ignore the last sorted elements).

Continue until no more passes are needed (array becomes sorted).*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//Time Complexity: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted).