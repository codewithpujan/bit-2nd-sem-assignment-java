public class BankingSystem {
    public static void main(String[] args){
        Bank bank=new Bank( "Nepal Rastra Bank");
        bank.displayBankInfo();

        Account acc1 = new Account("010202345678",1000000);
        Customer cust = new Customer("Yaku Shrestha",23,acc1);
        cust.displayCustomerDetails();

        acc1.deposit(500000);
        acc1.withdraw(2000);

        System.out.println("\n After Transaction: ");
        cust.displayCustomerDetails();

        cust=null;
        cust=null;
        System.gc();
    }
    
}