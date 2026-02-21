public class User {
    void role() {
        System.out.println("Generic user");
    }
    
}

class Admin extends User {
    @Override  //This is Polymorphism, where the child class (Admin) provides a specific implementation of the method defined in the parent class (User).
    void role() {
        System.out.println("Admin user");
    }
}

class Guest extends User {
    @Override
    void role() {
        System.out.println("Guest user");
    }
}

class Demo{
    public static void main(String[] args) {
        User u1=new User();
        User u2=new Admin();
        User u3=new Guest();
        u1.role();
        u2.role();
        u3.role();
    }
}
/*Tell about hierarchial inheritance in this example 
 */