import java.util.*;
public class BinarySearch
{
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            //Why not (left + right) / 2? To avoid potential overflow when left and right are large integers.
            //Example of such a case: if left = 2,000,000,000 and right = 2,000,000,001, then (left + right) would equal 4,000,000,001 which exceeds the maximum value for an integer in Java (2,147,483,647), causing an overflow. 
            //On the other hand, using left + (right - left) / 2 avoids this issue because it calculates the midpoint without directly adding left and right together.

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}