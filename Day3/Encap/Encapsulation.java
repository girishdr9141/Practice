
public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        //All the methods used to set and get the values of the private variables are called getter and setter methods respectively
        s1.setUsn(123);
        s1.setEmail("akashath@example.com");
        System.out.println("USN: " + s1.getUsn());
        System.out.println("Email: " + s1.getEmail());
    }

    
}
