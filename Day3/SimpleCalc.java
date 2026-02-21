public class SimpleCalc {
    void add(int a, int b) {
        System.out.println( (a + b));
    }
    
}

class AdvancedCalc extends SimpleCalc{
    void subtract(int a, int b) {
        System.out.println( (a - b));
    }
}

class SupAdvancedCalc extends AdvancedCalc{
    void multiply(int a, int b) {
        System.out.println( (a * b));
    }
    void square(int a) {
        System.out.println( (a * a));
    }
}

class MultilevelDemo{
    public static void main(String[] args) {
        System.out.println("******");
        SimpleCalc sc = new SimpleCalc();
        sc.add(10, 20);
        System.out.println("******");
        AdvancedCalc ac = new AdvancedCalc();
        ac.add(100, 200);
        ac.subtract(1000, 200);
        System.out.println("******");
        SupAdvancedCalc sac = new SupAdvancedCalc();
        sac.add(1, 2);
        sac.subtract(10, 5);
        sac.multiply(10, 20);
        sac.square(5);
        
}
}
/*Tell whats hapening in this multilevel inheritance example:
1. SimpleCalc is the base class with add method.
2. AdvancedCalc extends SimpleCalc and adds subtract method.
3. SupAdvancedCalc extends AdvancedCalc and adds multiply and square methods.
4. In main method, objects are created for each class and methods are called accordingly.
*/