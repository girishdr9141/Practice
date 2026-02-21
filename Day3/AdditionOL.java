public class AdditionOL {
    static void add(int a, int b) {
        System.out.println(a+b);
    }

 /* static int add(int a, int b) {
        System.out.println(a+b);
    }
} */
/*this will not compile as name and parameter are same in both methods */
static void add(int a, int b, int c) {
    System.out.println(a+b+c);
}
static void add(double a, double b) {
    System.out.println("Double");
    System.out.println(a+b);
}
static void add(float a, float b) {
    System.out.println("Float");
    System.out.println(a+b);
}
public static void main(String[] args) {
    add(10, 20);
    add(10, 20, 30);
    add(10.5, 20.5);
    add(10.5f, 20.5f);
    
}
}
