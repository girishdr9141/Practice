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
        int [] rotated = new int[n];
        for(int i = 0; i < n; i++){
            rotated[(i + d) % n] = arr[i];
            /*To rotate the array by d positions to the right, we calculate the new index as (i + d) % n for each element at index i. 
            Why (i + d) % n? Because when we add d to i, we might exceed the array bounds, so we use the modulo operator to wrap around to the beginning of the array.
            We are adding d to the index i and then taking the modulo n to ensure the index wraps around correctly.*/
        }
        System.out.println("Array after rotating by " + d + " positions:");
        System.out.println(Arrays.toString(rotated));
    }
}