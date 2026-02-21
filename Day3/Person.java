
//Inheritance Example
public class Person {
    String name;
    Person(String name)
    {
        this.name=name;
    }
    
}
class Student extends Person
{
    int roollno;
/* //Why error until we create constructor in student class? 
in short, when we create an object of student class, it will call the constructor of person class to initialize the name variable.
But if we don't create a constructor in student class, it will not call the constructor of person class and hence the name variable will not be initialized, which will lead to an error when we try to access it.
 */

   Student(int roollno, String name) {
        super(name);
        this.roollno = roollno;
    }
    void display()
    {
        System.out.println("Roll no: "+roollno+" Name: "+name);
        
    }

    public static void main(String[] args) {
        Student s=new Student(1,"John");
        s.display();
    }
    
}