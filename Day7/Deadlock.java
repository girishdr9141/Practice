class A{}
class B{}

public class Deadlock{
    static A objA = new A();
    static B objB = new B();

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            synchronized(objA){
                System.out.println("Thread 1 locked objA");
                try{
                    Thread.sleep(2400);
                }catch(Exception e){
                    System.out.println("Thread 1 waiting for Obj B");
                    synchronized(objB){
                        System.out.println("Thread 1 locked Obj B");
                    }
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized(objB){
                System.out.println("Thread 2 locked obj A");
                try{
                    Thread.sleep(2400);
                }catch(Exception e){
                    System.out.println("Thread 1 waiting for Obj A");
                    synchronized(objA){
                        System.out.println("Thread 1 locked Obj A");
                    }
                }
            }
        });
t1.start();
t2.start();
    }
}

//Deadlock: occurs when two or more threads are waiting for each others resources, and none of the