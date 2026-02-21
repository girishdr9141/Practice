package withconst;
public class Stud {
    int usn;
    String name;
    int marks;
   static String college="SNPSU";//Any common parameter that is shared by all the objects of the class can be declared as static and never written within the constructor

    Stud(int usn, String name, int marks) {
        this.usn = usn;//everything in the current class is accessed using this keyword
        this.name = name;
        this.marks = marks;
       
    }

    void evaluate() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } 
            
        else {
            System.out.println(name + " has failed.");
        }
    }
    void studentDetails() {
        System.out.println("USN: " + this.usn);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("College: " + college);
    }

    public static void main(String[] args)
     {
        Stud s1 = new Stud(123, "Akashath", 85);
        Stud s2 = new Stud(124, "Sharan", 35);

        s1.evaluate(); // Output: Alice has passed.
        s2.evaluate(); // Output: Bob has failed.
        s1.studentDetails();
        s2.studentDetails();
    }
}
