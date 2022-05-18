import java.util.Scanner;

public class simpleGame {
  
  public simpleGame(Card card1) {
    //checking if the player have enough balance from his/her card to play
    if (card1.getCardCredits() >= 20) {
      card1.deductCardBalance(20);
      startGame(card1);
    } else {
      System.out.println("You don't have enough balance to play this game.");
    }
  }

  public void startGame(Card card1) {
    Scanner input = new Scanner(System.in);
    String[] colors = {"A", "B", "C", "D"};

    System.out.println("Welcome to the game! You just spent 20 credits to play this game\n");
    System.out.println("[A] Brown\n [B] Blue\n [C] Orange\n [D] Teal\nPlease choose a color: ");
    String color = input.nextLine();
    
    int random = (int) (Math.random() * colors.length);
    if (color.equals(colors[random])) {
      System.out.println("------------------------------------------------");
      System.out.println("You win! Here are your 50 added tickets.");
      card1.addCardTickets(50);
      card1.cardInfo();
    } else {
      System.out.println("------------------------------------------------");
      System.out.println("Sorry, You lose!");
      card1.cardInfo();
    }
  }
}
