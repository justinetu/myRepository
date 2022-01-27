public class BankManagementSystemProject {
   public static void main(String[] args) {
       // TODO code application logic here
       displayMainMenu();
   }

   public static void displayMainMenu() {
       System.out.println("====================================================");
       System.out.println("            BANK MANAGEMENT SYSTEM");
       System.out.println("====================================================");

       System.out.println();
       System.out.println("MAIN MENU");
       System.out.println("1) NEW ACCOUNT");
       System.out.println("2) MAKE A DEPOSIT");
       System.out.println("3) MAKE A WITHDRAWAL");
       System.out.println("4) CHECK BALANCE");
       System.out.println("5) VIEW PREVIOUS TRANSACTIONS");
       System.out.println("6) EXIT");
       System.out.println();
       userSelection();
   }

   public static void userSelection() {
       int choice;
       double deposit;
       double withdraw;
       do {
           Scanner keyboard = new Scanner(System.in);

           System.out.print("Select an option (1-6) from the menu above >> ");
           choice = keyboard.nextInt();
           Account account = new Account();

           switch (choice) {
               case 1:
                   newAccount(choice);
                   break;

               case 2:
                   //double deposit = 0;

                   System.out.print("Enter an amount to deposit >> ");
                   deposit = keyboard.nextDouble();
                   account.deposit(deposit);
                   break;

               case 3:
                   //double withdraw = 0;
                   //Account anotherAccount = new Account();
                   System.out.print("Enter how much you want to withdraw >> ");
                   withdraw = keyboard.nextDouble();
                   account.withdraw(withdraw);
                   break;

               case 4:
                   account.showBalance();
                   break;


           }
       } while(choice != 6);

   }


   public static void newAccount(int userChoice) {
       System.out.println("====================================================");
       System.out.print("Greetings! Enter your name >> ");
       Scanner keyboard = new Scanner(System.in);
       String usersName = keyboard.next();

       //Generating a random number for the Account ID
       Random rand = new Random();

       //Storing the random value in a variable called id
       int id = rand.nextInt();


       //The id will be 5 digits only so we will convert it to a string first to extract the first five numbers
       String idNum = "" + id;
       idNum = idNum.substring(0,6);

       //After we alter the id to contain 5 numbers, we will change it back to an int type
       int userID = Integer.parseInt(idNum);


       //Read the newline character that is in the keyboard buffer from the previous user input


       //Getting the users email address
       String userEmail;
       keyboard.next();
       System.out.print("Enter your email address >> ");
       userEmail = keyboard.next();




       //Calling the Account constructor and passing the users name and randomly generated id
       Account newAccount = new Account(usersName, Math.abs(userID), userEmail);

       //Completed created a new account
       System.out.println();
       System.out.println("Congrats! Your account is created!");
       System.out.println("====================================================");
       newAccount.display();


   }

}
