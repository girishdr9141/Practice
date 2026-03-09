import java.util.*;
public class MergeLinkedList
{
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        //What we are doing here is creating a LinkedList called list1 and initializing it with the elements 1, 2, 3, 4, and 5 using Arrays.asList() method. This allows us to quickly create a list with predefined values.
        List<Integer> list2 = new LinkedList<>(Arrays.asList(6, 7, 8, 9, 10));
       
       System.out.println("List 1: " + list1);
       System.out.println("List 2: " + list2);
       // Merging list2 into list1
       list1.addAll(list2); // This will add all elements of list2 to the end of list1
       System.out.println("Merged List: " + list1);
    }
}