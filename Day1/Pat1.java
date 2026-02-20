import java.util.Scanner;

public class Pat1 {


    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 5 && j % 3 != 0 || i == 4 && j % 3 == 0 || i + j == 3 || i - j == -3) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}