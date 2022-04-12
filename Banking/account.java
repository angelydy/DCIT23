import java.util.Scanner;

public class account {

  public void withdrawal(int amount, int withdrawalAmount) {
    if (withdrawalAmount > amount) {
        System.out.println("\nInsufficient Funds");
        System.exit(0);
    } else if (withdrawalAmount < 100) {
        System.out.println("\nMinimum withdrawal amount is 100");
        System.exit(0);
    } else if (withdrawalAmount % 100 != 0) {
        System.out.println("\nWithdrawal amount should be in multiples of 100");
        System.exit(0);
    } else {
      System.out.println("Withdrawal Successful");
    }
  }
}
