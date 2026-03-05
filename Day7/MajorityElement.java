import java.util.*;
public class MajorityElement {
//Find the majority element in an array (element appearing more than n/2 times) using Moore’s Voting Algorithm.
    public static int majority(int []arr){
        int count=0;
        int candidate=0;
        /*count → tracks the vote count

candidate → possible majority element */
//2.Traverse
        for(int num:arr){
            //3.If count becomes 0, choose the current element as new candidate.
            if(count==0){
                candidate=num;
            }
            /*4.If element equals candidate → increase vote.
            If element is different → decrease vote.
            Meaning: different elements cancel each other's votes.
             */
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
        //5.After traversal, the remaining candidate is the majority element.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int majorityElement = majority(arr);
        System.out.println("The majority element is: " + majorityElement);
    }
}