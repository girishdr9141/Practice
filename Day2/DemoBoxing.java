public class DemoBoxing {
    public static void main(String[] args) {

        // 1️⃣ Boxing (primitive → object manually)
        int a = 10;
        Integer obj1 = Integer.valueOf(a);
        System.out.println("Boxing: " + obj1);

        // 2️⃣ Unboxing (object → primitive manually)
        Integer obj2 = new Integer(20);
        int b = obj2.intValue();
        System.out.println("Unboxing: " + b);

        // 3️⃣ Autoboxing (automatic primitive → object)
        int c = 30;
        Integer obj3 = c; 
        System.out.println("Autoboxing: " + obj3);

        // 4️⃣ Autounboxing (automatic object → primitive)
        Integer obj4 = 40;
        int d = obj4;
        System.out.println("Autounboxing: " + d);

        // 5️⃣ new String()
        String s1 = new String("Hello");
        System.out.println("Using new String(): " + s1);

        // 6️⃣ parseInt() (String → int)
        String num = "123";
        int parsed = Integer.parseInt(num);
        System.out.println("parseInt(): " + parsed);
    }
}