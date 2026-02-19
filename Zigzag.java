import java.util.Scanner;

public class Zigzag {


    public static void main(String[] args) {
        for (int r = 1; r <=3; r++) {
            for (int c = 1; c <=13; c++) {
                if (r == 1 && c % 4 == 3 || r == 2 && c % 2 == 0 || r == 3 && c%4 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}