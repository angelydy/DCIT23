import java.util.Scanner;

public class terminals {

	public static double loadCredits(int id) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Angely's Arcade!\nThis is the terminal. How much do you want to pay to add credits for your card with card #" + id + " (enter a whole number only)\nNOTE THAT 2 CREDITS FOR EVERY $1: ");
    double amount = input.nextDouble();
    int rate = 2;
    int totalCredits = (int) (amount * rate);
    System.out.println("\nSUCCESS! YOU HAVE " + totalCredits + " CREDITS.");
    return totalCredits;
	}
}
