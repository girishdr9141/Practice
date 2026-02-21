public class L1823 {
    
    static int findTheWinner(int n, int k)//n is the number of people and k is the step count
    {
        if (n == 1)
            return 1;//base case, if there is only one person, that person is the winner
        return (findTheWinner(n - 1, k) + k - 1) % n + 1;
        /* //recursive case, we find the winner for n-1 people 
        and then shift the position by k-1 
        and adjust it to be within the circle of n people Normalisation is done by adding 1 to the result of the modulo operation
         and convert it to 1-based index */


         //What is normalisation here?
            //Normalisation is the process of adjusting the result of the modulo operation to be within the range of 1 to n instead of 0 to n-1.
        //Why do we add k-1?
            //We add k-1 because the counting starts after the removal of the person, so we need to shift the position by k-1 to account for the removed person.
        }

    public static void main(String[] args) {
        int n = 5, k = 2;
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