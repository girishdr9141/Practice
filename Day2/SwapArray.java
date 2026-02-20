public class SwapArray {

    // method to swap two elements in array
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        int x=10,y=20;   // array storing numbers

        System.out.println("Before swap:");
        System.out.println("First = " + x);
        System.out.println("Second = " + y);

       int[] arr={x,y}  ; // swapping using array
      swap(arr);
      x=arr[0];
      y=arr[1];
        System.out.println("After swap:");
        System.out.println("First = " + x);
        System.out.println("Second = " + y);
    }
}