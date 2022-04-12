import java.util.Scanner;

public class securityPin  {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int validPin = 102601;
    System.out.println("Please enter your pin: ");
    int pin = scan.nextInt();

    while (pin != validPin) {
      System.out.println("Invalid pin. Please try again: ");
      pin = scan.nextInt();
    } System.out.println("Success! Access granted.");
  }
}