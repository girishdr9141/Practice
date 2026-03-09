import java.util.*;
public class ArrayListNoGenerics
{
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("Hello");
        list.add(3.14);
        list.add(true);
// TODO An ArrayList of type Object is created, so it can store different data types.
        System.out.println("List: " + list);
       for(int i=0;i<list.size();i++){
         // Integer num = (Integer) list.get(i); // This will throw a ClassCastException when it tries to cast "Hello" to Integer
          Object obj = list.get(i);
         System.out.println("Object at index " + i + ": " + obj);
        }
    }
}