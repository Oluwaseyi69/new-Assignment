import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
          Account account1 = new Account("Jane Green", 50.00);
          Account account2 = new Account("John Blue", -7.53);
   
          System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
          System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
          
          Scanner input = new Scanner(System.in);
          
          System.out.print("Enter deposit amount for account1: ");
          double depositAmount1 = input.nextDouble();
          System.out.printf("%n adding %.2f to account1 balance%n%n",depositAmount1);
          //account1.deposit(depositAmount);
          double newBalance1 = account1.getBalance() + depositAmount1;
          
          
          System.out.printf("%s balance: $%.2f%n", account1.getName(), newBalance1);
          //System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
          System.out.printf("  ");
          
          System.out.print("Enter deposit amount for account2: ");
	  double depositAmount2 = input.nextDouble();
          System.out.printf("%n adding %.2f to account2 balance %n%n", depositAmount2);
          //account2.deposit(),depositAmount);
          double newBalance2 = account2.getBalance() + depositAmount2;
          
          
          //System.out.printf("%s balance: $%.2f%n", account1.getName(), newBalance1);
          System.out.printf("%s balance: $%.2f%n%n", account2.getName(), newBalance2);
          
   }
}
