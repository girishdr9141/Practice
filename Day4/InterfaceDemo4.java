
interface Human{
    void power();//By default public and abstract
    // Not be able to use constructor in interface.WHy? Because we cannot create object of interface
    //But in collection framework we can create object of interface 
    //We cannot have instance variable in interface. Why? Because we cannot create object of interface
    //insert non abstract method in interface using default keyword
    //Using interface we can acheive 100% abstraction
    default void identify(){
        System.out.println("Gangadhar");
    }
}
class Shaktiman implements Human{
    //You have to initialize the power method of Human interface in Shaktiman class, otherwise it will give error
    @Override
    public void power(){
        System.out.println("Five Elements");
    }
}

    
public class InterfaceDemo4 {
    public static void main(String[] args) {
        Human h=new Shaktiman();
    //    / Human h1=new Human();/We cannot create object of interface, becuse it 100% abstract
        h.power();
        h.identify();
    }
    
}
