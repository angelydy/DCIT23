import java.util.Scanner;

public class payment {
  private double totalAmount;
  private double change;

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public void pay() {
    System.out.printf("\nAmount to pay is: $%.2f", totalAmount);
  }

  public void change() {
    Scanner input = new Scanner(System.in);
    System.out.println("\n\nEnter Amount to Pay:");
    double payment = input.nextDouble();

    while (payment < totalAmount) {
      System.out.println("\nSorry you did not pay enough, please try again ");
      System.out.println("\nEnter Amount to Pay:");
      payment = input.nextDouble();
    }

    if (payment > getTotalAmount()) {
      change = payment - getTotalAmount();
      System.out.printf("\nTransaction successful, your change is: $%.2f", change);
    }
  }
}
