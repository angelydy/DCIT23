import java.util.Scanner;

public class payment {
  private int totalAmount;
  private double change;

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  public void pay() {
    System.out.println("\n\t\tAmount to pay is: $" + totalAmount);
  }

  public void change() {
    Scanner input = new Scanner(System.in);
    System.out.println("\n\t\tEnter Amount to Pay:");
    double payment = input.nextDouble();

    while (payment < totalAmount) {
      System.out.println("\n\t\tSorry you did not pay enough, please try again ");
      System.out.println("Enter Amount to Pay:");
      payment = input.nextDouble();
    }

    if (payment > totalAmount) {
      change = payment - totalAmount;
      System.out.println("Transaction successful your change is: $" + change);
    }
  }
}
