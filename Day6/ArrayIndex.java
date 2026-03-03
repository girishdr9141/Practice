import java.util.Scanner;
public class ArrayIndex{

    static void fetchElement(int arr[],int index) throws ArrayIndexOutOfBoundsException
    {//If we forget to throw the exception in method body then throws will automatically throw an exception to catch block and it will give us the default message of the exception. But if we throw an exception with a custom message then it will give us the custom message in catch block.
        if(index<0 || index>=arr.length)
            throw new ArrayIndexOutOfBoundsException("Index "+index+" is out of bounds for array of length "+arr.length);
            
    
    else{
        System.out.println("Element at index "+index+" is: "+arr[index]);
    }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index to fetch element:");
        int index=sc.nextInt();
        try {
            fetchElement(arr,index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: "+e.getMessage());
        }
        finally{
            //If no exception in the code, then finally block will be executed after try block. If there is an exception, then finally block will be executed after catch block.
            System.out.println("This block will always be executed");
        }
    }
}