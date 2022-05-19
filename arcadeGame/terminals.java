import java.util.Scanner;

public class terminals {

  //this is where the action menu is like some actions connected to the card
  //as well as starting the game.

  public terminals(Card card1) {
    System.out.println("\nWelcome to Angely's Arcade!\nThis is the terminal.\nChoose an action to perform: \n\n1. Load Credits\n2. Play Game\n3. Transfer Credits\n4. Request a Prize\n5. Check card status\n6. Exit");
    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();
    if (choice == 1) {
      loadCredits(card1.getCardNumber());
    } else if (choice == 2) {
      simpleGame g = new simpleGame(card1);
    } else if (choice == 3) {
      System.out.println("How much would you like to transfer?");
      int transfer = input.nextInt();
      System.out.println("Where do you want to transfer them to?\n1. Card 1\n2. Card 2");
      int cardNumber = input.nextInt();
      if (cardNumber == 1) {
        Card card2 = new Card();
        card1.transferCredits(card2, transfer);
      } else if (cardNumber == 2) {
        card1.transferCredits(card1,transfer);
      }
    }  else if (choice == 4) {
      card1.requestPrize();
    }  else if ( choice == 5) {
      card1.cardInfo();
    } else if (choice == 6) {
      System.out.println("Thank you for visiting us!");
      System.exit(0);
    } else {
      System.out.println("Invalid choice. Please try again.");
    }

    while (choice != 4) {
      System.out.println("\nWelcome to Angely's Arcade!\nThis is the terminal.\nChoose an action to perform: \n\n1. Load Credits\n2. Play Game\n3. Transfer Credits\n4. Request a Prize\n5. Check card status\n6. Exit");
      choice = input.nextInt();
      if (choice == 1) {
        loadCredits(card1.getCardNumber());
      } else if (choice == 2) {
        simpleGame g = new simpleGame(card1);
      } else if (choice == 3) {
        System.out.println("How much would you like to transfer?");
        int transfer = input.nextInt();
        System.out.println("Where do you want to transfer them to?\n1. Card 1\n2. Card 2");
        int cardNumber = input.nextInt();
        if (cardNumber == 1) {
          Card card2 = new Card();
          card1.transferCredits(card2, transfer);
        } else if (cardNumber == 2) {
          card1.transferCredits(card1,transfer);
        }
      }  else if (choice == 4) {
        card1.requestPrize();
      } else if ( choice == 5) {
        card1.cardInfo();
      } else if (choice == 6) {
        System.out.println("Thank you for visiting us!");
        System.exit(0);
      } else {
        System.out.println("Invalid choice. Please try again.");
      }
    }
  }

	public static double loadCredits(int id) {
    Scanner input = new Scanner(System.in);
    System.out.println("How much do you want to pay to add credits for your card with card #" + id + " (enter a whole number only)\nNOTE THAT 2 CREDITS FOR EVERY $1: ");
    double amount = input.nextDouble();
    int rate = 2;
    int totalCredits = (int) (amount * rate);
    System.out.println("\nSUCCESS! CARD #" + id + " HAVE " + totalCredits + " CREDITS.");
    System.out.println("---------------------------------------\n");
    return totalCredits;
	}
}
