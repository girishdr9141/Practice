public class Outer {
    private int x=10;

    class Inner {
        void display() {
            System.out.println("Value of x is: " + x); //Accessing the private variable x of the Outer class using an object of the Inner class
        }
    }

    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner in=out.new Inner(); //Creating an object of the Inner class using the object of the Outer class
        in.display();
    }
    
}
