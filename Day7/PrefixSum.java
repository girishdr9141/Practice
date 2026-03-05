import java.util.*;
public class PrefixSum
//what is prefix sum?
/*A prefix sum is an array-based technique that stores cumulative totals, where each element at index 
 represents the sum of all elements from the beginning up to that index (
 */
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            arr[i] += arr[i - 1]; // Update each element to be the sum of itself and the previous element
        }
        System.out.println("Prefix sum array:");
        System.out.println(Arrays.toString(arr));
    }
}