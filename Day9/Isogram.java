/*Isogram String (Short Definition)

// ?An Isogram is a word or sentence in which no letter repeats (each letter appears only once).

Example:
"lamp" → l, a, m, p (no repeating letters)

So "lamp" is an Isogram.

Example of not an isogram:
"hello" → letter l repeats. */
import java.util.*;
public class Isogram
{
    public static void main(String[] args) {
        String str = "lamp";
        boolean isIsogram = checkIsogram(str);
        if(isIsogram){
            System.out.println("The string is an isogram.");
        } else {
            System.out.println("The string is not an isogram.");
        }
    }
    
    public static boolean checkIsogram(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        Set<Character> letters = new HashSet<>();
        
        for(char ch : str.toCharArray()) {
            if(Character.isLetter(ch)) { // Check if the character is a letter
                //isLetter(ch) belongs to Character class
                if(letters.contains(ch)) { // If the letter is already in the set, it's not an isogram
                    return false;
                }
                letters.add(ch); // Add the letter to the set
            }
        }
        
        return true; // If we finish checking without finding duplicates, it's an isogram
    }
}