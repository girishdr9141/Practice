import java.util.*;
public class SeperateChaining {
    static int tableSize=10;
    static LinkedList<Integer>[] Table=new LinkedList[tableSize];
    static void insert(int key){
        int index=key%tableSize;
        if(Table[index]==null){
            Table[index]=new LinkedList<Integer>();
        }
        Table[index].add(key);
    }


    /*If the position Table[index] is empty, create a new LinkedList at that index.

Add the key to the LinkedList at that index.

// ? Because a LinkedList is used, multiple keys can be stored at the same index (this handles collision). */

    static void display(){
        for(int i=0;i<tableSize;i++){
            System.out.print("Index: " + i + " Values: ");
            if(Table[i]!=null){
                for(int value: Table[i]){
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insert(43);
        insert(35); 
        insert(45);
        insert(15);
        insert(5);
        insert(33);

        display();
    }
}
    