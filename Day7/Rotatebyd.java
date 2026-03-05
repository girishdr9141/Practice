import java.util.*;
public class Rotatebyd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();
        d = d % n; // Handle cases where d >= n
        int[] temp = new int[d];
        // Store first d elements in temp
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        // Shift remaining elements to the left
        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];//To move left, we need to subtract d from the index i to place the element in the correct position. 
        }
        // Place temp elements at the end
        for(int i = 0; i < d; i++){
            arr[n - d + i] = temp[i];//To place the elements from temp at the end of the array, we calculate the starting index as n - d and then add i to it to fill in the temp elements correctly.
        }
        System.out.println("Array after rotating by " + d + " positions:");
       System.out.println(Arrays.toString(arr));
    }
//Logic 2 : Using Reversal Algorithm
voi
}