import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scan.nextInt();

    while (num < 0 || num > 12) {
      System.out.println("Invalid number. Please choose a number from 1 to 12 only: ");
      num = scan.nextInt();
    } 
    factorial(num);
  }

  static void factorial(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    System.out.printf("Factorial: %d",result);
  }
}
