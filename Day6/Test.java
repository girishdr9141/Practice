class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super();  // calls parent constructor
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println(super.color); // parent variable
    }

    void sound() {
        super.sound(); // parent method
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.sound();
    }
}