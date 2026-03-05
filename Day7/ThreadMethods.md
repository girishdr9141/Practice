Important Thread Methods (Short Interview Style)
1️⃣ start()

Purpose: Starts a new thread and internally calls run().

Key point: Creates separate execution path.

2️⃣ run()

Purpose: Contains the task that the thread executes.

3️⃣ sleep(time)

Purpose: Pauses the current thread for a given time.

Example
Thread.sleep(1000); → thread pauses 1 second

4️⃣ join()

Purpose: Makes one thread wait until another thread finishes.

Example: main thread waits for child thread.

5️⃣ yield()

Purpose: Temporarily pauses current thread and gives chance to other threads of same priority.

6️⃣ isAlive()

Purpose: Checks whether the thread is still running or not.

Returns
true → thread running
false → thread finished

7️⃣ getState()

Purpose: Returns the current state of a thread.

Common states:

NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED


Deadlock occurs when two or more threads hold resources and wait for each other's resources indefinitely, preventing further execution.

synchronized in Java (Short Interview Style)
Definition

synchronized is used to control access to shared resources
 so that only one thread can execute a critical section at a time.

👉 Prevents race condition.


synchronized(object){
    // critical section
}
How it Works

Thread acquires lock on the object.

Other threads must wait until the lock is released.

Ensures mutual exclusion