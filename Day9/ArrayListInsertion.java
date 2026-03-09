import java.util.*;
public class ArrayListInsertion
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       list.add(10);
         list.add(20);
       list.add(0, 100); // Inserting 100 at index 0 begining
       list.add(1, 200); // Inserting 200 at index 1 specific position
       System.out.println(list);
    }
}