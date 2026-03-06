import java.util.*;
public class InterpollationSearch
{
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target) {
                    return low; // Target found at index low
                }
                return -1; // Target not found
            }

            // Calculate the position using interpolation formula
            int pos = low + ((high - low) * (target - arr[low])) / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos; // Target found at index pos
            } else if (arr[pos] < target) {
                low = pos + 1; // Search in the right subarray
            } else {
                high = pos - 1; // Search in the left subarray
            }
        }
        return -1; // Target not found in the array
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
        int result = interpolationSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
/*Tell about its time complexity and space complexity.
Time Complexity: The time complexity of interpolation search is O(log log n) in the best case 
and O(n) in the worst case. The best case occurs when the target element is located near the middle of the array, while the worst case occurs when the target element is located at the beginning or end of the array.

Space Complexity: The space complexity of interpolation search is O(1) because it uses a constant amount of extra space for variables and does not require any additional data structures.*/