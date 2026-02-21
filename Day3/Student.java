

public class Student {
    private int usn;
    String name;
    int marks;

    void evaluate() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } 
            
        else {
            System.out.println(name + " has failed.");
        }
    }
    public static void main(String[] args) {
        //object creation => className objectName = new className(); this is a constructor call
        Student s1 = new Student();
        s1.usn = 123;
        s1.name = "Akashath";
        s1.marks = 85;

        Student s2 = new Student();
        s2.usn = 124;
        s2.name = "" ;

        s2.marks = 35;

        s1.evaluate(); // Output: Alice has passed.
        s2.evaluate(); // Output: Bob has failed.
    }
}
