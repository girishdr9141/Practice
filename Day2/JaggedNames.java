class JaggedNames {
    public static void main(String[] args) {

        // jagged array: each row has different length
        char[][] names = {
                {'R','a','m'},
                {'A','n','i','t','a'},
                {'J','o','h','n'}
        };

        // printing names
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
            }
            System.out.println(); // move to next line after each name
        }
        for (char[] name : names) {
            for (char ch : name) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}