public class JumpSearch{
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n); // Calculate the optimal jump size

        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; // Target is not present in the array
            }
        }

        // Perform linear search in the identified block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
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
        int result = jumpSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
/*Tell about its time complexity and space complexity.
Time Complexity: The time complexity of jump search is O(√n) in the worst case.
 This occurs when the target element is located at the end of the array or is not present in the array. 
 In the best case, when the target element is located at the beginning of the array, the time complexity is O(1).

Space Complexity: The space complexity of jump search is O(1) because it uses a constant amount of extra space for variables and does not require any additional data structures.*/