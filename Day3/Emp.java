public class Emp {
    int id;
    String name;
    double salary;
    static String company="TCS";
    Emp()
    {
        this(0,"Unknown",0);
        //this is default constructor which is calling the parameterized constructor with default values using this keyword
    }
    public Emp(int id, String name) {
       this(id,name,30000);
       //this is parameterized constructor which is calling another parameterized constructor with default salary value using this keyword
       //here 2 parameters are dependent on the 3 parameter constructor and the 3 parameter constructor is called as primary constructor and the other 2 parameter constructor is called as secondary constructor
    }
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //uNTIL I write the third constructor the first two constructors were showing error.
    //this is Constructir Channing where one constructor is calling another constructor in the same class using this keyword
    //Benefit: Reusability and avoid code duplication
    //One is dependent on another constructor and the dependent constructor is called as a primary constructor and the other constructor is called as a secondary constructor
    void display()
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary );
    }
    public static void main(String[] args) {
        Emp e1=new Emp();
        Emp e2=new Emp(101,"John");
        Emp e3=new Emp(102,"Jane",50000);
        e1.display();
        e2.display();
        e3.display();
    }
}
