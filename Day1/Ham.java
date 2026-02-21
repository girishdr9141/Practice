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

// 🔹 Logic to Remember (Interview Friendly)

// 👉 Think: “Check last bit → Count → Shift”

// 1️⃣ Check last bit using
// (n & 1) → tells if last bit is 1 or 0

// 2️⃣ If it is 1, increase count

// 3️⃣ Right shift number using n >> 1
// → removes the last bit

// 4️⃣ Repeat until number becomes 0

// 5️⃣ Return count (that’s Hamming weight)