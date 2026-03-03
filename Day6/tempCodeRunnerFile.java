finally{
            System.out.println("This block will always be executed");
           // throw new IllegalStateException("This is an exception thrown inside finally block");
            //When we throw an exception from finally block, it will be propagated to the caller method. If there is no caller method to catch the exception, then it will be propagated to the JVM and will cause the program to terminate.
        }