import java.util.*;
public class sqrootthroughBinsearch
{
    public static int squareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0 || n == 1) {
            return n; // The square root of 0 is 0 and the square root of 1 is 1
        }

        int left = 1;//
        int right = n / 2; // The square root of n will not be greater than n/2 for n > 1

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid; // Use long to avoid overflow

            if (midSquared == n) {
                return mid; // Found the exact square root
            } else if (midSquared < n) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return right; // The integer part of the square root is right when left exceeds right
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        try {
            int result = squareRoot(n);
            System.out.println("The integer part of the square root of " + n + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}