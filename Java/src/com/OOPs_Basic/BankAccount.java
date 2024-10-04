package Java.src.com.OOPs_Basic;


//! Access Modifiers
public class BankAccount {

    // Fields with different access modifiers
    public String accountHolderName;
    protected double balance;
    String accountType; // default access
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, double balance, String accountType, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sahil Kumar", 1000.0, "Savings", "1234567890");
        account.displayAccountDetails();

        // Accessing fields directly
        System.out.println("Accessing Public Field: " + account.accountHolderName);
        System.out.println("Accessing Protected Field: " + account.balance);
        System.out.println("Accessing Default Field: " + account.accountType);
        // The following line would cause a compilation error
         System.out.println("Accessing Private Field: " + account.accountNumber);
    }
}


/*
! Notes :-
? Access Modifiers :: Access modifiers in Java are keywords that are used to set the accessibility (visibility) of classes, interfaces, methods, and fields.
                    ? It is a way to achieve data hiding in Java because other classes will not be able to access the data that is private.
                      1. private
                      2. default
                      3. protected
                      4. public

    * 1. private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    * 2. default: Accessible only within the same package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    * 3. protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
    * 4. public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

 */
