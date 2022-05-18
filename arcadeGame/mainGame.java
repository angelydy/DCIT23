/**
 * main
 */
public class mainGame {

  public static void main(String[] args) {
    //Instantiate 2 cards and whatever other objects might be necessary to test your program.
    Card card1 = new Card(1, "Spades");
    Card card2 = new Card(2, "Hearts");
    //Load credits onto each card.
    card1.loadCredits(10);
    card2.loadCredits(20);
    //Play a bunch of game using both cards.
    //Transfer the balance of credits and tickets from Card 1 to Card 2.
    card1.transferCredits(card2, 5);
    //Request prizes using Card 2.
    card2.requestPrize();
    //Try to play a game and request a prize using Card 1.
    card1.requestPrize();
    //Perform whatever other actions might be necessary to test your program
  }
}