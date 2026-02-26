public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         
        /* The ^ symbol inside the square brackets negates the character class, so it matches any character that is not in the specified range. 
        In this case, it removes all non-alphanumeric characters from the string. */
        
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String testString =" A man, a plan, a canal: Panama ";
        System.out.println("Is the string a palindrome? " + vp.isPalindrome(testString));
    }
}
//TIME COMPLEXITY: O(n) where n is the length of the input string, because we need to iterate through the string to clean it and then check for palindrome.
//SPACE COMPLEXITY: O(n) in the worst case, if all characters are alphanumeric, we create a new string of the same length as the input string.