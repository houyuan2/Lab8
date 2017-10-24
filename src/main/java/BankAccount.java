import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * defines bankAccount.
     *
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     *
     * @param name the owner name
     * @param accountCategory account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * Implement getters and setters as appropriate for private variables.
     */
    public int getaccountNumber() {
        return accountNumber;
    }

    public double getaccountBalance() {
        return accountBalance;
    }

    public  String getownerName() {
        return ownerName;
    }

    public double setinterestEarned() {
        return interestEarned;
    }

    public void setaccountNumber(int a) {
        accountNumber = a;
    }

    public void setaccountBalance(double a) {
        accountBalance = a;
    }

    public  void setownerName(String n) {
        ownerName = n;
    }

}