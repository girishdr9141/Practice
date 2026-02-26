

public class BankAccount2 {
    private String accountNumber;
    private double balance;
    private int pin;
    private int WrongPinAttempts;
    private boolean isLocked;
    public BankAccount2(String AccNo, double initbal, int pin) {
        this.accountNumber = AccNo;
        this.balance = initbal;
        this.pin = pin;
        this.WrongPinAttempts = 0;
        this.isLocked = false;
    }
    public void deposit(double amount){
        if(!isLocked && amount>0)
        {
            balance+=amount;
            System.out.println("Deposited: " + amount);

        }
        else{
            System.err.println("Deposit failed");//Differentiate between normal output and error output? 
            /* //System.err.println() is used to print error messages to the console.
             It is a standard error output stream that is typically used to display error messages or warnings. 
             When you use System.err.println(), the message will be displayed in red color in most IDEs or consoles, making it easier to identify as an error message. 
            In contrast, System.out.println() is used for normal output and does not have any special formatting for errors.
       */      
        }
    }

    public void withdraw(double amount, int enteredPin){
        if(isLocked){
            System.err.println("Account is locked. Withdrawal failed.");
            return;
        }
        if(enteredPin != pin){
            WrongPinAttempts++;
            System.err.println("Wrong pin");
            if(WrongPinAttempts >= 3){
                isLocked = true;
                System.err.println("Account locked .");
            }
            return;
        }
        WrongPinAttempts = 0; // Reset wrong pin attempts after successful pin entry
        if(amount>0 && amount<=balance && amount<=25000){
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.err.println("Withdrawal failed.");
        }
    }
    public double getBalance(int enteredPin){
        if(!isLocked && enteredPin == pin){
            return balance;
        }
        System.err.println("Access denied");
        return -1;

        
}
public boolean isAccountLocked(){
    return isLocked;
}
public static void main(String[] args) {
    BankAccount2 account = new BankAccount2("123456789", 50000, 1234);
    account.deposit(5000);
    account.withdraw(1250, 1134);
        account.withdraw(1250, 1134);
        account.withdraw(1250, 1134);
        account.withdraw(1250, 1234);
    System.out.println("Balance: " + account.getBalance(1234));
}
}

