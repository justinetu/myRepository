public class Account {
   private String name;
   private int accountNumber;
   private String emailAddress;
   private double balance;
   private double previousTransaction;


   //Constructors
   public Account() {

   }


   public Account(String customerName, int accountNumber, String email) {
       name = customerName;
       this.accountNumber = accountNumber;
       emailAddress = email;
   }



   //Method for deposit
   public void deposit(double amount) {
       if(amount != 0) {
           balance = balance + amount;
           previousTransaction = amount;


       }

   }
   //Method for withdraw
   public void withdraw(double amount) {
       if(amount != 0) {
           balance = balance - amount;
           previousTransaction = -amount;

       }
   }
   //Method to show the previous transaction
   public void getPreviousTransaction() {
       if(previousTransaction > 0) {
           System.out.println("Deposited: $" + String.format("%.2f", previousTransaction));
       }
       else if(previousTransaction < 0) {
           System.out.println("Withdrew: " + String.format("%.2f", previousTransaction));
       }
       else {
           System.out.println("No transaction occurred.");
       }
   }



   void showBalance() {

       System.out.println();
       System.out.println("====================================================");
       System.out.println("Balance: $" + String.format("%.2f", balance));
       System.out.println("====================================================");
   }



   void display() {
       System.out.println("Owner of this account: " + name);
       System.out.println();
       System.out.println("Account number: " + accountNumber);
       System.out.println();
       System.out.println("Email address: " + emailAddress);
   }

}
