public class InsertionSort
{
    public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
    }
    /*Insertion Sort – Step by Step (Short Explanation)

// ? Start from the second element of the array.

Take the current element as key.

// ? Compare the key with the elements before it (in the sorted part).

// ? If the previous element is greater than the key, shift it one position to the right.

Continue shifting elements until the correct position for the key is found.

Insert the key at its correct position.

Move to the next element and repeat the process.

Continue until all elements are placed in the correct order (array becomes sorted). */

    public static void main(String[] args) {
        int[] arr={12,11,13,5,6};
        insertionsort(arr);
        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
/*Insertion Sort is a comparison-based sorting algorithm // TODO that builds the sorted array one element at a time
 by inserting each element into its correct position in the already sorted portion of the array. */

 // ? TIME COMPLEXITY: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted).