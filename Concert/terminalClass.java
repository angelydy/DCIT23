import java.util.Scanner;

public class terminalClass extends schedule {

  public terminalClass() {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("\n████████╗██╗ ██████╗██╗  ██╗███████╗████████╗    ██████╗ ███████╗███████╗███████╗██████╗ ██╗   ██╗ █████╗ ████████╗██╗ ██████╗ ███╗   ██╗");
      System.out.println("╚══██╔══╝██║██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝    ██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗██║   ██║██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║");
      System.out.print("     ██║   ██║██║     █████╔╝ █████╗     ██║       ██████╔╝█████╗  ███████╗█████╗  ██████╔╝██║   ██║███████║   ██║   ██║██║   ██║██╔██╗ ██║");
      System.out.println("   ██║   ██║██║     ██╔═██╗ ██╔══╝     ██║       ██╔══██╗██╔══╝  ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██╔══██║   ██║   ██║██║   ██║██║╚██╗██║");
      System.out.print("     ██║   ██║╚██████╗██║  ██╗███████╗   ██║       ██║  ██║███████╗███████║███████╗██║  ██║ ╚████╔╝ ██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║");
      System.out.println("   ╚═╝   ╚═╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝       ╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝");
      System.out.println("\n\nSelect your ticket type: ");
      System.out.println("1. Economy $20.00");
      System.out.println("2. VIP $100.00\n");

      int ticketType = input.nextInt();

      while ( ticketType != 1 && ticketType != 2 ) {
        System.out.println("Invalid input, please try again: ");
        System.out.println("Select your ticket type: ");
        System.out.println("1. Economy $20.00");
        System.out.println("2. VIP $100.00\n");
        ticketType = input.nextInt();

        if (ticketType == 1) {
          super.setType("Ticket Type: Economy");
          super.setPrice(20.00);
          break;
        } else if (ticketType == 2) {
          super.setType("Ticket Type: VIP");
          super.setPrice(100.00);
          break;
        }
      } 

      super.setAvailableSlot(10);

      System.out.println("\nPick a schedule: ");
      System.out.println("1. 8:00 AM" + " (" + super.getAvailableSlot() + " available)");
      System.out.println("2. 3:00 PM" + " (" + super.getAvailableSlot() + " available)");
      int schedule = input.nextInt();

      while ( schedule != 1 && schedule != 2 ) {
        System.out.println("\nInvalid input, please try again: ");
        System.out.println("Pick a schedule: ");
        System.out.println("1. 8:00 AM" + "(" + super.getAvailableSlot() + " available)");
        System.out.println("2. 3:00 PM" + super.getAvailableSlot() + " available");
        schedule = input.nextInt();
      }

      if (schedule == 1) {
        super.setTime("8:00 AM");
        super.setAvailableSlot(super.getAvailableSlot() - 1);
      } else if (schedule == 2) {
        super.setTime("3:00 PM");
        super.setAvailableSlot(super.getAvailableSlot() - 1);
      }

      while (true) {
        System.out.println("\nNo. of Tickets to Buy: ");
        int ticketCount = input.nextInt();
        if (ticketCount > 0) {
          super.setAmount(ticketCount);
          break;
        } else {
          System.out.println("Invalid input, please try again: ");
        }
      }

      //shows summary of transaction
      System.out.println("\n███████ ██    ██ ███    ███ ███    ███  █████  ██████  ██    ██");
      System.out.println("███████ ██    ██ ███    ███ ███    ███  █████  ██████  ██    ██");
      System.out.println("██      ██    ██ ████  ████ ████  ████ ██   ██ ██   ██  ██  ██  ██");
      System.out.println("███████ ██    ██ ██ ████ ██ ██ ████ ██ ███████ ██████    ████");
      System.out.println("███████ ██    ██ ██ ████ ██ ██ ████ ██ ███████ ██████    ████");
      System.out.println("     ██ ██    ██ ██  ██  ██ ██  ██  ██ ██   ██ ██   ██    ██    ██");
      System.out.println("███████  ██████  ██      ██ ██      ██ ██   ██ ██   ██    ██\n");
      System.out.println("\n Ticket Type: ");
      System.out.println(super.getType());
      System.out.println("\nSchedule: ");
      System.out.println(super.getTime());
      System.out.println("\nNo. of Tickets: ");
      System.out.println(super.getAmount());
      super.pay();
      super.change();
      System.out.println("\nBuy Again? (Y/N)");
      String buyAgain = input.next();
      if (buyAgain.equals("Y") || buyAgain.equals("y")) {
        continue;
      } else {
        break;
      }
    }
  }
}
