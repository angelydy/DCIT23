import java.util.Scanner;

/**
 * main
 */
public class test {

  public static void main(String[] args) {
    //instantiating 2 new cards
    Card card1 = new Card();
    Card card2 = new Card();
    //calling the terminals to ask the player some actions to do
    //in terminal, you can ask for the card info, transfer credits, request a prize, or select a game
    System.out.println("Which card would you like to use?\n1. Card 1\n2. Card 2");
    Scanner input = new Scanner(System.in);
    int cardChoice = input.nextInt();
    if (cardChoice == 1) {
      terminals t = new terminals(card1);
    } else {
      terminals t2 = new terminals(card2);
    }
  }
}