

public class Account {
    private String accountNumber;
    private double balance;

    Account(){
        this.accountNumber = "000011111222";
        this.balance = 0.0;
    }
    Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
    
    // @Override
    // protected void finalize() throws Throwable{
    //     System.out.println("Account " + accountNumber + "is closed");
    // }

}
