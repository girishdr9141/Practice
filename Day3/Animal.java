public class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println("Animal eats food");
    }
    
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
   
}

class puppy extends Dog {
    @Override
    void eat() {
        super.eat(); // This will call the eat method of the parent class (Dog) which in turn calls the eat method of the grandparent class (Animal)
        System.out.println("Puppy drinks milk");
    }
}

class Demo {
    public static void main(String[] args) {
        Animal a1 = new puppy();
        a1.sound();
        a1.eat();
       
    }
}