public class L1823 {
    
    static int findTheWinner(int n, int k) {
        if (n == 1)
            return 1;
        return (findTheWinner(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        int n = 5, k = 3;
        System.out.println(findTheWinner(n, k));
    }
}
// 👉 If we know winner for n-1 people,
// we can find winner for n people by shifting positions.

// Formula:

// winner(n) = (winner(n-1) + k - 1) % n + 1
// 🔹 Steps to Remember (Easy)

// 👉 Think: “Base → Reduce → Shift → Adjust”

// 1️⃣ Base case
// If only 1 person → winner = 1

// 2️⃣ Reduce problem
// Find winner for n-1 people

// 3️⃣ Shift position
// Add (k-1) because counting starts after removal

// 4️⃣ Adjust in circle
// Use % n to stay inside circle

// 5️⃣ Convert to 1-based index
// Add +1