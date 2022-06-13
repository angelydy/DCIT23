import java.util.Scanner;

public class payment {
  //get the total amount to be paid from ticket class
  private int totalAmount;
  private int change;

  public payment(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  public void pay() {
    System.out.println("Amount to pay is: $" + totalAmount);
  }

  public void change() {
    Scanner input = new Scanner(System.in);
    int payment = input.nextInt();
    change = payment - totalAmount;
    System.out.println("Transaction successful your change is: $" + change);
  }
}
