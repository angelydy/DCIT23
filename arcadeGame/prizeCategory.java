public class prizeCategory {
  //Each prize category has a name, number of tickets required to earn that prize, and a 
  //count of how many items of this category remain in a terminal. Prizes know nothing about the terminal they belong to.
  //The terminal is responsible for managing the prizes.

  private String name;
  private int ticketsRequired;
  private int count;

  public prizeCategory(String name, int ticketsRequired, int count) {
    this.name = name;
    this.ticketsRequired = ticketsRequired;
    this.count = count;
  }
}
