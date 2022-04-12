import java.util.Scanner;

public class Banking {
 public static void main(String[] args) {
  account acc = new account();
  Scanner scan = new Scanner(System.in);

  int initialBalance = 10000;
  System.out.println("User's Name: ");
  String userName = scan.nextLine();
  System.out.println("User's Account Number: ");
  int accountNumber = scan.nextInt();
  System.out.println("Enter Withdrawal Amount: ");
  int withdrawalAmount = scan.nextInt();

  acc.withdrawal(initialBalance, withdrawalAmount);
  System.out.println("\n===================================");
  System.out.println("User's Name: " + userName);
  System.out.println("User's Account Number: " + accountNumber);
  System.out.println("User's Withdrawn Amount: " + withdrawalAmount);
  System.out.println("User's Remaining Balance: " + (initialBalance - withdrawalAmount));
 } 
}
