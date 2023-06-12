package java_problems_datastructures;

public class CreditCardN {

	 // Instance variables:
    private String customer; // name of the customer (e.g., ”John Bowman”)
    private String bank; // name of the bank (e.g., ”California Savings”)
    private String account; // account identifier (e.g., ”5391 0375 9387 5309”)
    private int limit; // credit limit (measured in dollars)
    protected double balance; // current balance (measured in dollars)
// Constructors:

    public CreditCardN(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCardN(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
    }

    // Accessor methods:
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    // Update methods:
    public boolean charge(double price) { // make a charge
        if (price + balance > limit) // if charge would surpass limit
            return false; // refuse the charge
        // at this point, the charge is successful
        balance += price; // update the balance
        return true; // announce the good news
    }

    // Modified method to reject negative payments
    // below method won't accept the negative payments
    public void makePayment(double amount) { // make a payment

        if (amount < 0) {
            System.out.println("Your payment can not be negative :( ");
        } else
            balance -= amount;

    }

    // Utility method to print a card's information
    public static void printSummary(CreditCardN card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit); // implicit cast
    }

    public static void main(String[] args) {
        CreditCardN[] wallet = new CreditCardN[3];
        wallet[0] = new CreditCardN("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCardN("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCardN("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }

        for (CreditCardN card : wallet) {
            CreditCardN.printSummary(card); // calling static method
            if (card.getBalance() > 200.0) {
                card.makePayment(-200); // calling payment method passing negative value as payment.
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}
