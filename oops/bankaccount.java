public class bankaccount {
    // Private fields
    private double balance;
    private String accountNumber;
    private String accountType;

    // Constructor
    public bankaccount(String accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        setBalance(balance); // Use setter to ensure validation
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty.");
        }
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for accountType
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (!accountType.equals("Checking") && !accountType.equals("Savings") && !accountType.equals("Business")) {
            throw new IllegalArgumentException("Account type must be 'Checking', 'Savings', or 'Business'.");
        }
        this.accountType = accountType;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("BankAccount(accountNumber='%s', accountType='%s', balance=%.2f)",
                             accountNumber, accountType, balance);
    }

    // Example usage
    public static void main(String[] args) {
        try {
            // Create a new bank account
            bankaccount account = new bankaccount("123456789", "Checking", 1000.0);

            // Print account details
            System.out.println(account);

            // Deposit funds
            account.deposit(500);
            System.out.println("After deposit: " + account);

            // Withdraw funds
            account.withdraw(200);
            System.out.println("After withdrawal: " + account);

            // Update balance
            try {
                account.setBalance(-100);  // This will throw an exception
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Update account type
            try {
                account.setAccountType("Investment");  // This will throw an exception
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

