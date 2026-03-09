/*Anagram String (Short Definition)

An Anagram is when two words or strings contain the same characters with the same frequency but arranged in a different order.

Example:
// TODO listen → silent

Both words contain the same letters (l, i, s, t, e, n) but in a different order, so they are anagrams. */

import java.util.*;
public class Anagram
{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        boolean areAnagrams = checkAnagram(str1, str2);
        if(areAnagrams){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
    
    public static boolean checkAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Check if the sorted character arrays are equal
        return Arrays.equals(arr1, arr2);
    }
}