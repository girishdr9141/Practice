//Deprecated after java 9, not recommended to use
public class Finalize{
    protected void finalize(){
        System.err.println("Finalize method is called");
    }
    public static void main(String[] args) {
        Finalize f=new Finalize();
        f=null;//Finalize object is eligible for Garbage Collection.
        System.gc();//Requesting JVM to perform Garbage Collection.
        System.err.println("GC is requested");
    }

}

//Heap Structure
/*
1.Young Generation
2.Old Generation
3.Permanent Generation (Metaspace in Java 8 and later)
 */