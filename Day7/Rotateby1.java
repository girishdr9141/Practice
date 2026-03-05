import java.util.*;
public class Rotateby1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[n-1];
        for(int i = n-1; i > 0; i--)//Loop from the end of the array to the beginning, shifting each element to the right by one position. 
        {
            arr[i] = arr[i-1];//to shift the elements to the right, we assign the value of arr[i-1] to arr[i], effectively moving each element one position to the right. 
        }
        arr[0] = last;
        System.out.println("Array after rotating by 1 position:");
       System.out.println(Arrays.toString(arr));//Print like a list [1, 2, 3] instead of 1 2 3
    }

}

/*Step 1: Store last element

last = arr[n-1]

Step 2: Shift elements to the right

for i = n-1 to 1
    arr[i] = arr[i-1]

Step 3: Place last element at first position

arr[0] = last */