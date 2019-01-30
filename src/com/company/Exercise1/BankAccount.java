package Exercise1;

public class BankAccount {
    private int balance;
    private int accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(123123, 123123, "asd", "asdasd", "12312");
    }

    public BankAccount(int balance, int accountNumber, String customerName, String email, String phoneNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(123,123,customerName, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("You deposit your balance " + amount + " and now your balance is " + this.balance);
    }

    public void withdraw(int amount) {
        if(this.balance - amount < 0) {
            System.out.println("You can't withdraw");
        } else {
            this.balance -= amount;
            System.out.println("You withdraw your balance " + amount + " and now your balance is " + this.balance);
        }

    }


}
