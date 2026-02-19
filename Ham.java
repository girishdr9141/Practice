import java.util.Scanner;

public class Ham {

   static int hamming(int n)//Static is used so we do not have to creat e an object, it tells that the method belongs to class
    {
        int count=0;
        while(n>0)
        {
            if((n & 1)==1)
                count++;
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(hamming(11));
        System.out.println(hamming(10 ));

    }
}