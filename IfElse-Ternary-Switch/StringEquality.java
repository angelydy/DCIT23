import java.util.Scanner;

public class StringEquality {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scan.nextLine();

    //check wether name is "Moe" without using == symbol.
    if (name.equals("Moe") || name.equals("moe")) {
      System.out.println("You are the king of rock and roll");
    } else {
      System.out.println("You are not the king");
    }
  }
}
