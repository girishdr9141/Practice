class MyThread3 extends Thread{
    public void run(){
        System.out.println("getName(): " + getName() + ", started state: " + getState());
        Thread.yield();// Yielding to allow other threads to execute
        //It only hints to thread scheduler
        /*Priority Basis  
         */
        try {
            Thread.sleep(12000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
            
        }  
        System.out.println("getName(): " + getName() + ", after sleep state: " + getState());
    }

}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        System.out.println("Before start ,t1 is alive: " + t1.isAlive());

        t1.start();
        t2.start();

       

       try {
           t1.join(); // Wait for t1 to finish
           //join() is inside a try-catch block because it can throw InterruptedException if the thread is interrupted while waiting.
           t2.join(); // Wait for t2 to finish
       } catch ( InterruptedException e) {
           System.out.println("Main thread interrupted: " + e.getMessage());
       }
       System.out.println("After start ,t1 : " + t1.getState());
       System.out.println("After start ,t2 : " + t2.getState());
       System.err.println("After join ,t1 : " + t1.getState());
       System.err.println("After join ,t2 : " + t2.getState());
       System.out.println("After join ,t1 is alive: " + t1.isAlive());
         System.out.println("After join ,t2 is alive: " + t2.isAlive());
    }
}