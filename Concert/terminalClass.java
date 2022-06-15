import java.util.Scanner;

public class terminalClass extends schedule {

  public terminalClass() {
    Scanner input = new Scanner(System.in);
    while (true) {

      if (getAvailableSlot() == 0 && getAvailableSlot2() == 0) {
        System.out.println("\nSOLD OUT!");
        System.out.println("Sorry, there are no more seats available");
        break;
      }

      System.out.println("\n████████╗██╗ ██████╗██╗  ██╗███████╗████████╗    ██████╗ ███████╗███████╗███████╗██████╗ ██╗   ██╗ █████╗ ████████╗██╗ ██████╗ ███╗   ██╗");
      System.out.println("╚══██╔══╝██║██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝    ██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗██║   ██║██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║");
      System.out.println("   ██║   ██║██║     █████╔╝ █████╗     ██║       ██████╔╝█████╗  ███████╗█████╗  ██████╔╝██║   ██║███████║   ██║   ██║██║   ██║██╔██╗ ██║");
      System.out.println("   ██║   ██║██║     ██╔═██╗ ██╔══╝     ██║       ██╔══██╗██╔══╝  ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██╔══██║   ██║   ██║██║   ██║██║╚██╗██║");
      System.out.println("   ██║   ██║╚██████╗██║  ██╗███████╗   ██║       ██║  ██║███████╗███████║███████╗██║  ██║ ╚████╔╝ ██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║");
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
          setType("Ticket Type: Economy");
          setPrice(20.00);
          break;
        } else if (ticketType == 2) {
          setType("Ticket Type: VIP");
          setPrice(100.00);
          break;
        }
      } 

      if (ticketType == 1) {
        setType("Ticket Type: Economy");
        setPrice(20.00);
      } else if (ticketType == 2) {
        setType("Ticket Type: VIP");
        setPrice(100.00);
      }

      System.out.println("\nPick a schedule: ");
      System.out.println("1. 9:00 AM" + " (" + getAvailableSlot() + " tickets available)");
      System.out.println("2. 1:00 PM" + " (" + getAvailableSlot2() + " tickets available)\n");
      int schedule = input.nextInt();

      while ( schedule != 1 && schedule != 2) {
        System.out.println("\nInvalid input, please try again: ");
        System.out.println("Pick a schedule: ");
        System.out.println("1. 9:00 AM" + " (" + getAvailableSlot() + " tickets available)");
        System.out.println("2. 1:00 PM" + " (" + getAvailableSlot2() + " tickets available)\n");
        schedule = input.nextInt();
      }

      while (true) {
        System.out.println("\nNo. of Tickets to Buy: ");
        int ticketCount = input.nextInt();
        
        if (ticketCount > getAvailableSlot() || ticketCount == 0) {
          System.out.println("Sorry, there are not enough tickets available.\n");
          System.out.println("Do you still want to buy? (y/n)");
          String answer = input.next();
          if (answer.equals("y")) {
            continue;
          } else if (answer.equals("n")) {
            System.out.println("\nThank you for using our service.\n");
            System.exit(0);
          }
        } else if (ticketCount < getAvailableSlot() && ticketCount > 0 || ticketCount == 10) {
          setAmount(ticketCount);
          break;
        } 

        if (ticketCount > getAvailableSlot2() || ticketCount == 0) {
          System.out.println("Sorry, there are not enough tickets available.\n");
          System.out.println("Do you still want to buy? (y/n)");
          String answer = input.next();
          if (answer.equals("y")) {
            continue;
          } else if (answer.equals("n")) {
            System.out.println("\nThank you for using our service.\n");
            System.exit(0);
          }
        } else if (ticketCount < getAvailableSlot() && ticketCount > 0 || ticketCount == 10) {
          setAmount(ticketCount);
          break;
        } 
      }

      if (schedule == 1) {
        setTime("9:00 AM");
        setAvailableSlot(getAvailableSlot() - getAmount());
      } else if (schedule == 2) {
        setTime("1:00 PM");
        setAvailableSlot2(getAvailableSlot2() - getAmount());
      }

      //shows summary of transaction
      System.out.println("\n███████ ██    ██ ███    ███ ███    ███  █████  ██████  ██    ██");
      System.out.println("███████ ██    ██ ███    ███ ███    ███  █████  ██████  ██    ██");
      System.out.println("██      ██    ██ ████  ████ ████  ████ ██   ██ ██   ██  ██  ██  ██");
      System.out.println("███████ ██    ██ ██ ████ ██ ██ ████ ██ ███████ ██████    ████");
      System.out.println("███████ ██    ██ ██ ████ ██ ██ ████ ██ ███████ ██████    ████");
      System.out.println("     ██ ██    ██ ██  ██  ██ ██  ██  ██ ██   ██ ██   ██    ██    ██");
      System.out.println("███████  ██████  ██      ██ ██      ██ ██   ██ ██   ██    ██\n");
      System.out.println(getType() + " Ticket");
      System.out.println("\nSchedule: ");
      System.out.println(getTime());
      System.out.println("\nNo. of Tickets: ");
      System.out.println(getAmount());
      setTotalAmount(getAmount() * getPrice());
      pay();
      change();
      System.out.println("\n\nBuy Again? (Y/N)");
      String buyAgain = input.next();

      if (buyAgain.equals("Y") || buyAgain.equals("y")) {
        continue;
      } else if (buyAgain.equals("N") || buyAgain.equals("n")) {
        System.out.println("\nThank you for using our service.\n");
        break;
      } else {
        System.out.println("Invalid input, please try again: ");
        buyAgain = input.next();
      }
    }
  }
}
