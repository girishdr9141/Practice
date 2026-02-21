class MathUtil {

    // static method
    static int square(int x) {
        return x * x;
    }
}

// second class (must contain main)
public class TestStaticMethod {
    public static void main(String[] args) {

        int num = 5;

        // calling static method from another class
        int result = MathUtil.square(num);

        System.out.println("Square = " + result);
    }
}

/* class MathUtil {

    // non-static method
    int square(int x) {
        return x * x;
    }
}

// main class
public class TestNonStaticMethod {
    public static void main(String[] args) {

        int num = 5;

        // create object to call non-static method
        MathUtil obj = new MathUtil();

        int result = obj.square(num);

        System.out.println("Square = " + result);
    }
} */


/* 🔹 Difference from Static Version
Static Method	Non-Static Method
Called using class name	Called using object
No object needed	Object required
Belongs to class	Belongs to object */