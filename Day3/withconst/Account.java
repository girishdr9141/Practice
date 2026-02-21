
package withconst;
public class Account {
    
    int accounts;
    static int totalAccounts;
    //static variable to keep track of total accounts created
    Account() {
        totalAccounts++;
        int accountNo=totalAccounts;
    }
    static void displayTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }
    
        public static void main(String[] args) {
            new Account();
            new Account();
            new Account();
            Account.displayTotalAccounts(); // Output: Total accounts created: 3
        }
    
}
