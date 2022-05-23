
public class Card {
  private int id;
  private double cardBal;
  private int cardTickets;

  public Card() {
    this.cardTickets = 0;
    this.id = (int) (Math.random() * 100);
    this.cardBal = terminals.loadCredits(this.id);
  }

  public void cardInfo() {
    //print card info
    System.out.println("---------------------------------------");
    System.out.println("CURRENT CARD STATUS:\n");
    System.out.println("Card #: " + this.id);
    System.out.println("Card Balance: " + this.cardBal);
    System.out.println("Tickets: " + this.cardTickets + "");
    System.out.println("---------------------------------------\n");
  }

  public int getCardNumber() {
    return this.id;
  }

  public double getCardCredits() {
    return cardBal;
  }

  public int getCardTickets() {
    return cardTickets;
  }
  
  public int addCardBal(double amount) {
    if (amount > 0) {
      amount *= 2;
      cardBal += amount;
      cardInfo();
      return 1;
    } else {
      System.out.println("Invalid amount. Please try again.");
      cardInfo();
      return 0;
    }
  }

  public int deductCardBalance(double amount) {
    if (cardBal >= amount) {
      cardBal -= amount;
      cardInfo();
      return 0;
    } else {
      cardInfo();
      return -1;
    }
  }

  public int addCardTickets(int amount) {
    if (amount > 0) {
      cardTickets += amount;
      return 1;
    } else {
      return 0;
    }
  }

  public int deductCardTickets(int amount) {
    if (cardTickets >= amount) {
      cardTickets -= amount;
      return 0;
    } else {
      return -1;
    }
  }

  public int transferCredits(Card otherCard, double amount) {
    if (cardBal >= amount) {
      System.out.println("Transferring " + amount + " credits from card #" + this.id + " to card #" + otherCard.id);
      otherCard.addCardBal(amount);
      deductCardBalance(amount);
      return 0;
    } else {
      return -1;
    }
  }

  public void requestPrize() {
    String prize1 = "Huge Bear Stuff Toy";
    int prize1Price = 100;
    String prize2 = "Photo Album";
    int prize2Price = 200;
    String prize3 = "Aqua Flask Water Bottle";
    int prize3Price = 500;

    if (cardTickets >= prize1Price && cardTickets < prize2Price) { 
      deductCardTickets(prize1Price);
      System.out.println("---------------------------------------\n");
      System.out.println("You have won a " + prize1);
      System.out.println("Prize value: " + prize1Price);
      cardInfo();
    }  else if (cardTickets >= prize2Price && cardTickets < prize3Price) {
      deductCardTickets(prize2Price);
      System.out.println("---------------------------------------\n");
      System.out.println("You have won a " + prize2);
      System.out.println("Prize value: " + prize2Price);
      cardInfo();
    } else if (cardTickets >= prize3Price) {
      deductCardTickets(prize3Price);
      System.out.println("---------------------------------------\n");
      System.out.println("You have won a " + prize3);
      System.out.println("Prize value: " + prize3Price);
      cardInfo();
    }  else if (cardTickets < 100) {
      System.out.println("---------------------------------------\n");
      System.out.println("You do not have enough tickets to win a prize. You should have atleast 100 or more tickets.");
      cardInfo();
    } else {
      System.out.println("---------------------------------------\n");
      System.out.println("You do not have enough tickets to win a prize");
      cardInfo();
    }
  }
}
