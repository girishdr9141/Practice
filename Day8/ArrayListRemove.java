import java.util.*;
public class ArrayListRemove
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i=1;i<=10;i++){
           list.add(i);
       }
       for(int i=0;i<list.size();i++){
           if(list.get(i)>7){
               list.remove(i);
           }//Shifting happens when we remove an element, so we need to decrease the index by 1 to check the next element correctly
       }
       System.out.println(list);
    }
}