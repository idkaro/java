package Exercise1;

public class Check {
    public static void main(String[] args) {
       BankAccount bankAccount = new BankAccount();
       bankAccount.setAccountNumber(1);
       bankAccount.setBalance(10000);
       bankAccount.setCustomerName("Karo");
       bankAccount.setEmail("idskaro@gmail.com");
       bankAccount.setPhoneNumber("123123");
       bankAccount.deposit(500);
       bankAccount.withdraw(10000);

       BankAccount karoAccount = new BankAccount(10000, 12, "asd", "asd", "123123");
        System.out.println(karoAccount.getBalance());
    }
    }

