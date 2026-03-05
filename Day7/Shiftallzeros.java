import java.util.*;
public class Shiftallzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index = 0; // To keep track of the position to place non-zero elements
        // Traverse the array and move non-zero elements to the front
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
              int temp=arr[i];
                arr[i]=arr[index];
                arr[index++]=temp;
                /*
                1️⃣ Store current element in temp
2️⃣ Move element at index to position i
3️⃣ Place the non-zero element at position index
4️⃣ Increase index for the next non-zero element 
*/
            }
        }
       

        System.out.println("Array after shifting all zeros to the end:");
        System.out.println(Arrays.toString(arr));
    }
     static void shiftZeros(int[] arr, int n){
    int index = 0;

    // Step 1: Move non-zero elements to front
    for(int i = 0; i < n; i++){
        if(arr[i] != 0){
            arr[index++] = arr[i];
        }
    }

    // Step 2: Fill remaining positions with 0
    for(int i = index; i < n; i++){
        arr[i] = 0;
    }
}
}