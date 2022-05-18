
public class Card {
  private int id;
  private double cardBal;
  private int cardTickets;

  public Card() {
    this.cardBal = 0;
    this.cardTickets = 0;
    this.id = (int) (Math.random() * 100);
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
      return 1;
    } else {
      return 0;
    }
  }

  public int deductCardBalance(double amount) {
    if (cardBal >= amount) {
      cardBal -= amount;
      return 0;
    } else {
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

  public int requestPrize() {
    if (cardTickets > 0) {
      cardTickets--;
      return 0;
    } else {
      return -1;
    }
  }
}
