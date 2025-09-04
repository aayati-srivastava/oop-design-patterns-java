// Abstract class for common account structure
abstract class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accNo, String holder, double bal) {
        this.accountNumber = accNo;
        this.accountHolderName = holder;
        this.balance = bal;
    }

    // Abstract method (must be implemented by all child classes)
    abstract double calculateInterest();

    // Display account info
    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + accountHolderName);
        System.out.println("Balance       : " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount {
    double interestRate = 0.04; // 4% annual

    SavingsAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    CurrentAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    @Override
    double calculateInterest() {
        // Current accounts usually do not earn interest
        return 0;
    }
}

// Loan Account
class LoanAccount extends BankAccount {
    double loanInterestRate = 0.10; // 10% annual

    LoanAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    @Override
    double calculateInterest() {
        // Loan interest is typically charged on balance (outstanding loan)
        return balance * loanInterestRate;
    }
}

// Main Class
public class BankingSystemDemo {
    public static void main(String[] args) {
        // Create different account objects
        BankAccount acc1 = new SavingsAccount("S1001", "Alice", 10000);
        BankAccount acc2 = new CurrentAccount("C2001", "Bob", 20000);
        BankAccount acc3 = new LoanAccount("L3001", "Charlie", 50000);

        // Use polymorphism: same method call, different implementations
        BankAccount[] accounts = {acc1, acc2, acc3};

        for (BankAccount acc : accounts) {
            acc.displayInfo();
            System.out.println("Interest: " + acc.calculateInterest());
            System.out.println("-------------------------");
        }
    }
}