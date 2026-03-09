// TODO Collision occurs in a hash table when two or more keys produce the same hash index using the hash function.
public class HashTable
{
    static int tableSize = 10;
    static int[] hashTable = new int[tableSize];

    static void insert(int key){
        int hashValue = key % tableSize;

        if(hashTable[hashValue] != 0){
            System.out.println("Collision occurred for key " + key + " at index " + hashValue);
        }
        else{
            hashTable[hashValue] = key;
        }
    }

    static void display(){
        for(int i = 0; i < tableSize; i++){
            System.out.println("Index: " + i + " Value: " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        insert(25);
        insert(35); 
        insert(45);

        display();
    }
}