
import java.util.Scanner;
/* Strings are immutable in Java, meaning once a string is created, it cannot be changed.
 Any operation that seems to modify a string actually creates a new string object.
   */
public class StringMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        // String length
        System.out.println("Length of the string: " + input.length());
        // Convert to uppercase
        System.out.println("Uppercase: " + input.toUpperCase());
        // Convert to lowercase
        System.out.println("Lowercase: " + input.toLowerCase());
        //charAt
        System.out.println("Character at index 2: " + input.charAt(2));
        //substring(beginIndex, endIndex)
        System.out.println("Substring from index 2 to 5: " + input.substring(2, 5));
        //concat or +
        String str1 = "Cannon Bolt";
        System.out.println("Concatenated string: " + input.concat(str1));
        System.out.println("Concatenated string using +: " + input + str1);
        //equals
        System.out.println(input.equals("Ben 10"));
        //equalsIgnoreCase
        System.out.println(input.equalsIgnoreCase("ben 10"));
        //replace(oldChar, newChar)
        System.out.println("String after replacement: " + input.replace("10","20"));
        //trim
        System.out.println("String after trimming: '" + "    BEN 10   ".trim() );
        //startsWith
        System.out.println("Does the string start with 'Ben'? " + input.startsWith("Ben"));
        //endsWith
        System.out.println("Does the string end with '10'? " + input.endsWith("10"));
        //indexOf
        System.out.println("Index of '10': " + input.indexOf("10"));
        //compareTo
        System.out.println("Comparing with 'Ben 10': " + "aBen ".compareTo("A"));
        //split
        String[] parts = input.split(" ");
        for (String part : parts) {
            System.out.println("Split part: " + part);
        }
        //isLetter and isDigit
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                System.out.println(ch + " is a letter.");
            } else if(Character.isDigit(ch)){
                System.out.println(ch + " is a digit.");
            } else {
                System.out.println(ch + " is neither a letter nor a digit.");
            }
        }
    }
}
