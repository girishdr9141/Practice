public class Test2
{//Island of Isolation
    Test2 ref;//Reference variable of type Test2 which can hold the address of an object of type Test2.
    public static void main(String[] args) {
        Test2 t1=new Test2();
        Test2 t2=new Test2();
        t1.ref=t2;
        t2.ref=t1;//t1 is referring to t2 object. Now t1 and t2 are referring to the same object.

        Test2 external =t1;
        t1=null;
        t2=null;
        
        System.out.println(t1);
        System.out.println("External reference: "+external);
    }
}

/*👉 Island of Isolation means:
A group of objects refer to each other, but no external reference points to them, so they become eligible for Garbage Collection. */