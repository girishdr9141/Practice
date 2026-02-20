

import java.util.Scanner;

public class Bak {

    static int bak(int n)//Static is used so we do not have to creat e an object, it tells that the method belongs to class
    {
        int pieces=((n*(n+1))/2)+1;

        return pieces;
    }
    static int regions(int n)//Static is used so we do not have to creat e an object, it tells that the method belongs to class
    {
        int regions=((n*(n+1))/2)+1;

        return regions;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(bak(5));
        System.out.println(regions(4));


    }
}