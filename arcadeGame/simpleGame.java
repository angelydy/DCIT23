import java.util.Scanner;

public class simpleGame {
  
  public simpleGame(Card card1) {
    //checking if the player have enough balance from his/her card to play
    if (card1.getCardCredits() >= 20) {
      card1.cardInfo();
      chooseGame(card1);
    } else {
      System.out.println("You don't have enough balance to play this game.");
    }
  }

  private void chooseGame(Card card1) {
    Scanner input = new Scanner(System.in);

    System.out.println("GAMES TO PLAY\n1. Color Chooser \n2. Rock Paper Scissor \n3. Exit\n\nPlease choose a game to play: ");
    int choice = input.nextInt();
    if (choice == 1) {
      card1.deductCardBalance(20);
      colorChooser(card1);
    } else if (choice == 2) {
      card1.deductCardBalance(10);
      rockPaperScissor(card1);
    } else if (choice == 3) {
      System.out.println("Thank you for playing with us!");
      System.exit(0);
    } else {
      System.out.println("Invalid choice. Please try again.");
    }
  }

  private void rockPaperScissor(Card card1) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the game! You just spent 10 credits to play this game\n");
    System.out.println("1. Rock \n2. Paper \n3. Scissor \n4. Exit\nPlease choose your choice: ");
    int choice = input.nextInt();
    if (choice == 1) {
      System.out.println("You chose Rock");
      int computerChoice = (int) (Math.random() * 3) + 1;      
      if (computerChoice == 1) {
        System.out.println("Computer chose Rock");
        System.out.println("Draw! No tickets won.");
        card1.cardInfo();
      } else if (computerChoice == 2) {
        System.out.println("Computer chose Paper");
        System.out.println("You lose!No tickets won.");
        card1.cardInfo();
      } else if (computerChoice == 3) {
        System.out.println("Computer chose Scissor");
        System.out.println("You win! 50 tickets awarded.");
        card1.addCardTickets(50);
        card1.cardInfo();
      }
    } else if (choice == 2) {
      System.out.println("You chose Paper");
      int computerChoice = (int) (Math.random() * 3) + 1;
      if (computerChoice == 1) {
        System.out.println("Computer chose Rock");
        System.out.println("You win! 50 tickets awarded.");
        card1.addCardTickets(50);
        card1.cardInfo();
      } else if (computerChoice == 2) {
        System.out.println("Computer chose Paper");
        System.out.println("Draw! No tickets won.");
        card1.cardInfo();
      } else if (computerChoice == 3) {
        System.out.println("Computer chose Scissor");
        System.out.println("You lose! No tickets won.");
        card1.cardInfo();
      }
    } else if (choice == 3) {
      System.out.println("You chose Scissor");
      int computerChoice = (int) (Math.random() * 3) + 1;
      if (computerChoice == 1) {
        System.out.println("Computer chose Rock");
        System.out.println("You lose! No tickets won.");
        card1.cardInfo();
      } else if (computerChoice == 2) {
        System.out.println("Computer chose Paper");
        System.out.println("You win! 50 tickets awarded");
        card1.addCardTickets(50);
      } else if (computerChoice == 3) {
        System.out.println("Computer chose Scissor");
        System.out.println("Draw! No tickets won.");
        card1.cardInfo();
      }
    } else if (choice == 4) {
      System.out.println("\nThank you for playing with us!");
      card1.cardInfo();
      System.exit(0);
    } else {
      System.out.println("Invalid choice. Please try again.");
    }

    while (choice != 4) {
      System.out.println("1. Rock \n2. Paper \n3. Scissor \n4. Exit\nPlease choose your choice: ");
      choice = input.nextInt();
      if (choice == 1) {
        System.out.println("You chose Rock");
        int computerChoice = (int) (Math.random() * 3) + 1;      
        if (computerChoice == 1) {
          System.out.println("Computer chose Rock");
          System.out.println("Draw! No tickets won.");
          card1.cardInfo();
        } else if (computerChoice == 2) {
          System.out.println("Computer chose Paper");
          System.out.println("You lose!No tickets won.");
          card1.cardInfo();
        } else if (computerChoice == 3) {
          System.out.println("Computer chose Scissor");
          System.out.println("You win! 50 tickets awarded.");
          card1.addCardTickets(50);
          card1.cardInfo();
        }
      } else if (choice == 2) {
        System.out.println("You chose Paper");
        int computerChoice = (int) (Math.random() * 3) + 1;
        if (computerChoice == 1) {
          System.out.println("Computer chose Rock");
          System.out.println("You win! 50 tickets awarded.");
          card1.addCardTickets(50);
          card1.cardInfo();
        } else if (computerChoice == 2) {
          System.out.println("Computer chose Paper");
          System.out.println("Draw! No tickets won.");
          card1.cardInfo();
        } else if (computerChoice == 3) {
          System.out.println("Computer chose Scissor");
          System.out.println("You lose! No tickets won.");
          card1.cardInfo();
        }
      } else if (choice == 3) {
        System.out.println("You chose Scissor");
        int computerChoice = (int) (Math.random() * 3) + 1;
        if (computerChoice == 1) {
          System.out.println("Computer chose Rock");
          System.out.println("You lose! No tickets won.");
          card1.cardInfo();
        } else if (computerChoice == 2) {
          System.out.println("Computer chose Paper");
          System.out.println("You win! 50 tickets awarded");
          card1.addCardTickets(50);
        } else if (computerChoice == 3) {
          System.out.println("Computer chose Scissor");
          System.out.println("Draw! No tickets won.");
          card1.cardInfo();
        }
      } else if (choice == 4) {
        System.out.println("\nThank you for playing with us!");
        card1.cardInfo();
        System.exit(0);
      } else {
        System.out.println("Invalid choice. Please try again.");
      }
    } System.out.println("Thank you for playing with us!");
    System.exit(0);
  }

  public void colorChooser(Card card1) {
    Scanner input = new Scanner(System.in);
    String[] colors = {"A", "B", "C", "D"};

    System.out.println("Welcome to the game! You just spent 20 credits to play this game\n");
    System.out.println("[A] Brown\n[B] Blue\n[C] Orange\n[D] Teal\nPlease guess a color: ");
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
