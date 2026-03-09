import java.util.*;
/*Pangram String (Short Definition)

// ? A Pangram is a sentence that contains every letter of the English alphabet (a–z) at least once.

Example:
"The quick brown fox jumps over the lazy dog"

This sentence is a pangram because it contains all 26 letters (a–z). */
public class Pangram
{
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(str);
        if(isPangram){
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
    
    public static boolean checkPangram(String str) {
        //Why Set? A Set is used to store unique characters. It automatically handles duplicates, so we can easily check if all letters of the alphabet are present without worrying about counting occurrences.
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        Set<Character> letters = new HashSet<>();
        
        for(char ch : str.toCharArray())
        //toCharArray() method is used to convert the string into an array of characters, allowing us to iterate through each character in the string.
        {
            if(Character.isLetter(ch)) { // Check if the character is a letter
                letters.add(ch); // Add the letter to the set
            }
        }
        
        return letters.size() == 26; // A pangram must contain all 26 letters of the alphabet
    }
}