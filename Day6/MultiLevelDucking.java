import java.io.*;
public class MultiLevelDucking{

    static void readFile() throws IOException{
        FileReader fr = new FileReader("nonexistentfile.txt");
        System.out.println("File read successfully");
    }

    static void processFile() throws IOException{
        readFile();
    }
    static void handleFile() throws IOException{
      processFile();
    }
    public static void main(String[] args) {
        try{
            handleFile();
        }
        catch(IOException e){
            System.out.println("Caught exception in main : "+e.getMessage());
        }
        finally{
            System.out.println("This block will always be executed");
        }
    }
}


/*✅ What happens in this program (in short)

1️⃣ main() calls handleFile() inside a try block.
2️⃣ handleFile() calls processFile() → which calls readFile().
3️⃣ readFile() tries to open "nonexistentfile.txt".
4️⃣ File is not present → IOException occurs.
5️⃣ The exception is not handled in the methods, so it travels back (exception ducking).
6️⃣ It reaches main() and is caught in the catch block.
7️⃣ The error message is printed. */