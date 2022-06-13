public class terminal extends schedule {
  public terminal() {
    while (true) {
      System.out.println("Select your ticket type: ");
      System.out.println("1. Economy $20.00");
      System.out.println("2. VIP $100.00");

      Scanner input = new Scanner(System.in);
      int ticketType = input.nextInt();

      if (ticketType == 1) {
        ticketTypeString = "Economy";
      } else if (ticketType == 2) {
        ticketTypeString = "VIP";
      } else {
        System.out.println("Invalid ticket type");
        System.exit(0);
      }
    }
  }
}
