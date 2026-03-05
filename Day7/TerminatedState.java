class MyThread2 extends Thread{
    public void run(){
        System.err.println("Thread finished.");
    }
}
public class TerminatedState {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        //Thread object created → State: NEW
        t.start();
        //Thread started → State: RUNNABLE
        try {
            t.join(); 
            //Main thread waits until thread t finishes execution.
            // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted."+e.getMessage());
        }
        System.out.println("State of thread after completion: " + t.getState()); // Should print TERMINATED
    }
}//Thread completes run() → State becomes TERMINATED