public class Recursion {

    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
    static int countdigits(int n)
    {
        if (n==0)
            return 0;
        return 1+countdigits(n/10);
    }
    static int reverse(int n,int rev) 
    {
        if(n==0)
            return rev;
        rev=rev*10+n%10;
        return reverse(n/10,rev);
    }
    static int power(int x,int n)
    {
        if(n==0)
            return 1;
        return x*power(x,n-1);
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