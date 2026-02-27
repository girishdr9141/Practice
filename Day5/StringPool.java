public class StringPool1{
    public static void main(String[] args) {
        String s1="Ben10";
        String s2="Ben10";
        String s3=new String("Ben10");
        String s4=new String("Ben10");
        System.out.println("s1==s2: "+(s1==s2)); //true
        System.out.println("s1.equals(s2): "+s1.equals(s2)); //true
        System.out.println("s3==s4: "+(s3==s4)); //false beacause s3 and s4 are created using the new keyword, they are stored in different memory locations, so their references are different.
        System.out.println("s3.equals(s4): "+s3.equals(s4)); //true
        System.out.println("s1==s3: "+(s1==s3)); //false because s1 is a string literal stored in the string pool, while s3 is created using the new keyword and stored in the heap, so their references are different.
        System.out.println("s1.equals(s3): "+s1.equals(s3)); //true because it compares the values of the strings, not their references.

        //What is the string pool in Java?
        /* The string pool in Java is a special memory area where string literals are stored. 
        When a string literal is created, Java checks if an identical string already exists in the pool. 
        If it does, the reference to the existing string is returned instead of creating a new object. 
        This is why s1 and s2 point to the same memory location, while s3 and s4 do not.
     */
    //intern() method: The intern() method in Java is used to ensure that a string is added to the string pool.
    //Converts heap memory string to string pool memory string. 
    // If the string already exists in the pool, it returns the reference to the existing string.
        String s5 = new String("Ben10").intern();
        System.out.println("s1==s5: "+(s1==s5)); //true because s5 is interned, it points to the same memory location as s1 in the string pool.
        System.out.println("s1.equals(s5): "+s1.equals(s5)); //true

        //difference between == and equals() method:
        /* The == operator compares the references of the objects, meaning it checks if both operands point to the same memory location.
        The equals() method, on the other hand, compares the values of the objects.*/

        /*Difference between string pool and heap memory
         * String pool is a special memory area in the JVM where string literals are stored.
         * Heap memory is where objects are created using the new keyword.
        
         * If two strings are created using the new keyword with the same value, they are stored in different locations in heap memory.
         * If two strings are created as literals with the same value, they point to the same location in string pool memory.
         */
    }
}
