//All elements repeated twice only one unique element
// 🔹 XOR Step by Step
// Start with 0

// 0 ^ 4  = 4     → 000 ^ 100 = 100
// 4 ^ 2  = 6     → 100 ^ 010 = 110
// 6 ^ 1  = 7     → 110 ^ 001 = 111
// 7 ^ 5  = 2     → 111 ^ 101 = 010
// 2 ^ 2  = 0     → 010 ^ 010 = 000
// 0 ^ 4  = 4     → 000 ^ 100 = 100
// 4 ^ 1  = 5     → 100 ^ 001 = 101

// 🔹 Quick Trick to Remember

// 👉 Same numbers cancel in XOR

// 4 ^ 4 = 0
// 2 ^ 2 = 0
// 1 ^ 1 = 0
// Remaining = 5

public class Uniq {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 2, 4, 1};
        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res = res ^ arr[i];
        System.out.println("The unique element is" + res);
    }
}