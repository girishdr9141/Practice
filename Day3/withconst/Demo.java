
public class Demo {

    String i;//instance variable
    void change(String i) {
        this.i = i;//this keyword is used to refer to the current instance variable of the class
    }
    void display() {
        System.out.println("Value of i: " + i);
    }
    public static void main(String[] args) {
        Demo d= new Demo();
        d.change("ISE");
        d.display();
    }
}
