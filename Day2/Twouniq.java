/* 🔹 Step-by-Step XOR
Start = 0

0 ^ 1 = 1     → 000 ^ 001 = 001
1 ^ 2 = 3     → 001 ^ 010 = 011
3 ^ 3 = 0     → 011 ^ 011 = 000
0 ^ 2 = 2     → 000 ^ 010 = 010
2 ^ 1 = 3     → 010 ^ 001 = 011 
3 ^ 4 = 7     → 011 ^ 100 = 111*/

class Twouniq{
    static int xorall(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        return xor;
    }
    static void findTwoUnique(int[] arr){
        int xor = xorall(arr);
        int setbit = xor & -xor;
        int x = 0, y = 0;
        for(int i : arr){
            if((i & setbit) != 0){
                x ^= i;
            } else {
                y ^= i;
            }
        }
        System.out.println("The two unique numbers are: " + x + " and " + y);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4};
        findTwoUnique(arr);
    }
}
//Step-by-Step Logic (Simple)
//
//1️⃣ XOR all elements
//
//Duplicate numbers cancel out
//
//Result = a ^ b (two unique numbers)
//
//2️⃣ Find rightmost set bit
//
//setbit = xor & -xor

//👉 xor & -xor always keeps only the last 1-bit
//This bit is different in the two unique numbers
//
//3️⃣ Split numbers into two groups
//
//Group 1 → numbers having that bit = 1
//
//Group 2 → numbers having that bit = 0
//
//4️⃣ XOR inside each group
//
//Duplicates cancel again
//
//Each group gives one unique number