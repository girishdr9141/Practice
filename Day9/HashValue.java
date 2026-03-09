public class HashValue {
    public static void main(String[] args) {
       int key=25;
       int tableSize=10;
       int hashValue=key%tableSize;
       System.out.println("Hash value is: " + hashValue);
       //The program prints the hash value (index position) where the key should be stored in the hash table.
    }

}