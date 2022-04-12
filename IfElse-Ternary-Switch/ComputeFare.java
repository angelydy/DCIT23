import java.util.Scanner;

public class ComputeFare {
  public static void main(String[] args) {
    System.out.print("Enter the age: \n");
    Scanner keyboard = new Scanner(System.in);
    int age = keyboard.nextInt();
    int fare;

    if (age < 11) {
      fare = 3;
      System.out.printf("Your fare is $%d", fare);
    } else if (age > 11 && age < 65) {
      fare = 5;
      System.out.printf("Your fare is $%d", fare);
    } else {
      fare = 3;
      System.out.printf("Your fare is $%d", fare);
    }
  }
}
