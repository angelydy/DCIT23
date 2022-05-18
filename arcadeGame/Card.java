
public class Card {
  private int id;
  private double cardBal;
  private int cardTickets;

  public Card() {
    this.cardBal = 0;
    this.cardTickets = 0;
    this.id = (int) (Math.random() * 100);
  }

  public void cardInfo() {
    //print card info
    System.out.println("Card ID: " + this.id);
    System.out.println("Card Balance: " + this.cardBal);
    System.out.println("Tickets: " + this.cardTickets);
  }

  public int getCardNumber() {
    return id;
  }

  public double getCardCredits() {
    return cardBal;
  }

  public int getCardTickets() {
    return cardTickets;
  }
  
  public int addCardBal(double amount) {
    if (amount > 0) {
      cardBal += amount;
      cardInfo();
      return 1;
    } else {
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
      otherCard.addCardBal(amount);
      deductCardBalance(amount);
      return 0;
    } else {
      return -1;
    }
  }

  public void requestPrize() {
    String prize1 = "Huge Bear Stuff Toy";
    int prize1Price = 300;
    String prize3 = "Photo Album";
    int prize3Price = 500;
    String prize2 = "Aqua Flask Water Bottle";
    int prize2Price = 1000;
    String prize4 = "Mug";
    int prize4Price = 200;

    if (cardTickets >= prize1Price && cardTickets <= prize2Price) { 
      deductCardTickets(prize1Price);
      System.out.println("-------------------------------");
      System.out.println("You have won a " + prize1);
      System.out.println("Prize value: " + prize1Price);
      cardInfo();
    }  else if (cardTickets >= prize2Price && cardTickets <= prize3Price) {
      deductCardTickets(prize1Price);
      System.out.println("-------------------------------");
      System.out.println("You have won a " + prize1);
      System.out.println("Prize value: " + prize1Price);
      cardInfo();
    } else if (cardTickets >= prize3Price && cardTickets <= 2000) {
      deductCardTickets(prize1Price);
      System.out.println("-------------------------------");
      System.out.println("You have won a " + prize1);
      System.out.println("Prize value: " + prize1Price);
      cardInfo();
    } else if (cardTickets >=  prize4Price && cardTickets <= prize1Price) {
      deductCardTickets(prize1Price);
      System.out.println("-------------------------------");
      System.out.println("You have won a " + prize1);
      System.out.println("Prize value: " + prize1Price);
      cardInfo();
    }  else if (cardTickets <= 199) {
      System.out.println("-------------------------------");
      System.out.println("You do not have enough tickets to win a prize. You should have atleast 200 or more tickets.");
      cardInfo();
    } else {
      System.out.println("-------------------------------");
      System.out.println("You do not have enough tickets to win a prize");
      cardInfo();
    }
  }
}
