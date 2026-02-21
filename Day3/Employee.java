public class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    //static copy method to create a new Employee object with the same values as an existing one
    static Employee copy(Employee e) //here Employee acts as a return type and also as a parameter type
    {
        return new Employee(e.id, e.name);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "John Doe");
       //this is bad practice even though output comes Employee e2 = e1; // e2 references the same object as e1
        Employee e2 = Employee.copy(e1); // e2 is a new object with the same values as e1
       //Change 
        e2.display();
        /* //Employee e3=e2 Why this is bad practice because if we change the values of e2 it will also change the values of e1 
        because both e1 and e2 are referencing the same object in memory */
    }
    static{
        System.out.println("Start of the program");
        System.err.println("Internet Protocols loading..., System files loading...,Database loading...,.env loading...,requirements.txt loading...,Dockerfile loading...,Kubernetes loading...,Cloud services loading...");
        /* Any mandatory files that are required for the program to run
         can be loaded in the static block and it will be executed only once when the class is
          loaded into memory it will be executed before the main method 
     */
    }

}
