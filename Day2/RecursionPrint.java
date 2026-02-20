import java.util.Scanner;

class RecursionPrint {

    static void printN(int n) {
        if (n == 0)      // base case
            return;

        printN(n - 1);   // recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printN(n);
    }
}