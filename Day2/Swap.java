class Number {
    int value;   // variable to store number

}
public class Swap{

    // static method to swap values of two Number objects
    static void swap(Number n1, Number n2) {
        int temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }

    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number();
        a.value=10;
        b.value=20;

        System.out.println("Before swap:");
        System.out.println("a = " + a.value);
        System.out.println("b = " + b.value);

        swap(a, b);

        System.out.println("After swap:");
        System.out.println("a = " + a.value);
        System.out.println("b = " + b.value);
    }
}
