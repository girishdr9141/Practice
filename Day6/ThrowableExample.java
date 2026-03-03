public class ThrowableExample{
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            if(b==0){
                throw new Throwable("Division by zero is not allowed");//throw actually is returning an object
                //throw is used to explicitly throw an exception. In this case, we are throwing a Throwable with a custom message when b is zero.
                //Throwable is the superclass of all errors and exceptions in Java. By throwing a Throwable, we can catch it in the catch block and handle it accordingly.
            }
            int result=a/b;
            System.out.println("Result: "+result);

        } //if throw block not followed by catch block then it will give compile time error
        catch (Throwable e) {
            System.out.println("Caught Throwable: "+e.getMessage());
        }
    }
}
/*Throwable has two main subclasses: Exception and Error. 
Exceptions are conditions that a reasonable application might want to catch,
 while Errors are typically conditions that a reasonable application should not try to catch.
 */

 /*Difference between throw and throws:
1. throw is used to explicitly throw an exception, while throws is used in method signatures to declare that a method can throw certain exceptions.
2. throw is followed by an instance of Throwable (or its subclasses), while throws is followed by a list of exception types.
3. throw is used within the body of a method to indicate that an exception is being thrown, while throws is used in the method declaration to indicate that the method can throw exceptions that need to be handled by the caller.*/