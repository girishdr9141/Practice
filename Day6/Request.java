public class Request{
    //request garbage collction
    public static void main(String[] args) {
        Request r=new Request();
        r=null;//Request object is eligible for Garbage Collection.
        System.gc();//Requesting JVM to perform Garbage Collection.
        System.err.println("GC is requested");
}
/*👉 System.gc() is used to request the JVM to run Garbage Collection.

✔ It tells the JVM:
“Please clean unused objects from memory.”
4️⃣ JVM may or may not run GC immediately (it’s not guaranteed). */