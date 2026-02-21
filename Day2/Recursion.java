public class Recursion {

    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
        //n%10 gives the last digit and n/10 removes the last digit, so we are adding the last digit to the sum of the remaining digits until n becomes 0
    }
    static int countdigits(int n)
    {
        if (n==0)
            return 0;
        return 1+countdigits(n/10);
        //we are counting the digits by adding 1 for each digit and removing the last digit until n becomes 0
    }
    static int reverse(int n,int rev) //we are passing the reverse of the number as a parameter to avoid using a global variable
    {
        if(n==0)
            return rev;//when n becomes 0, we return the reverse of the number
        rev=rev*10+n%10;//we are adding the last digit to the reverse and shifting the reverse to the left by multiplying it by 10
        return reverse(n/10,rev);
        //we are reversing the number by adding the last digit to the reverse and removing the last digit until n becomes 0
    }
    static int power(int x,int n)//we are calculating x to the power n by multiplying x with itself n times
    {
        if(n==0)
            return 1;
        return x*power(x,n-1);//we are multiplying x with the power of x to the power n-1 until n becomes 0
    }
    static int fib(int n)
    {
        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits = " + sumOfDigits(num));
        System.out.println("No of digits = " + countdigits(num));
        System.out.println("Reverse = " + reverse(num,0));
        System.out.println("Power = " + power(2,3));
        System.out.println("Fibonacci = " + fib(5));
    }
}