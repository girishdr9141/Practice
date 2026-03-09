public class LinearProbing {
    static int tableSize=10;
    static int[] table=new int[tableSize];
    static void insert(int key){
        int index=key%tableSize;
        while(table[index]!=0){
            System.out.println("Collision occurred for key " + key + " at index " + index);
            index=(index+1)%tableSize; // Linear probing: Move to the next index
        }
        table[index]=key;
    }

    static void display(){
        for(int i=0;i<tableSize;i++){
            System.out.println("Index: " + i + " Value: " + table[i]);
        }
    }
    public static void main(String[] args) {
        insert(25);
        insert(35); 
        insert(45);

        display();
    }
}
