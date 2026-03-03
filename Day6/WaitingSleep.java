class MyThread1 extends Thread {
    @Override
    public void run() {
        try{
            System.err.println("Sleeping...");
            Thread.sleep(10000); // Sleep for 5 seconds
            System.err.println("Woke up!");
        } catch (InterruptedException e) {
            
        }
    }
}

public class WaitingSleep {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
    }
}
//We use start() to create a new thread and begin its execution.
/*✔ What start() does internally

1️⃣ Creates a new thread
2️⃣ Moves it to Runnable state
3️⃣ JVM then calls run() automatically */

