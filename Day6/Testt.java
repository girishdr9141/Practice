public class Testt{
//Object created inside method display() will be eligible for garbage collection after the method execution is completed.
void display(){
        Testt t1=new Testt();
    }
    public static void main(String[] args) {
        Testt t=new Testt();
        System.out.println(t1); //Address of the object created in main method. This object is eligible for garbage collection after the main method execution is completed.
        t.display();
        //4.Anonymous object which is not stored in any reference variable is also eligible for garbage collection immediately after its creation.
    
        new Testt(); 
    }
}