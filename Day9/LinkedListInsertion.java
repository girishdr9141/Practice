import java.util.*;
public class LinkedListInsertion
{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
       list.add(10);
         list.addLast(20);
       list.addFirst(100); // Inserting 100 at index 0 begining
       list.add(1, 200); // Inserting 200 at index 1 specific position
       System.out.println(list);
    }
}