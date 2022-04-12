import java.awt.Color;
import java.util.Scanner;

/**
 * OnlineGameEvent
 */
public class OnlineGameEvent {

  public static void main(String[] args) {
    //create a new game using JOptionPane
    String playerName, countryName, gameCategory, sexChoice;
    int gameChoice, playerAge;
    UIManager.put("OptionPane.background", Color.BLACK);
    UIManager.put("Panel.background", Color.BLACK);
    UIManager.put("OptionPane.messageForeground", Color.WHITE);

    playerName = JOptionPane.showInputDialog("Enter your name");
    playerAge = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
    sexChoice = JOptionPane.showInputDialog("Choose your sex\n (F) OR (M)");
    gameChoice= Integer.parseInt(JOptionPane.showInputDialog("Select Game Category\n1 = Shooting\n2 = Racing\n3 = Battle Arena\n4 = Real-Time Strategy\n5 = Survival"));
    if (gameChoice == 1) {
      gameCategory = "Shooting";
    } else if (gameChoice == 2) {
      gameCategory = "Racing";
    } else if (gameChoice == 3) {
      gameCategory = "Battle Arena";
    } else if (gameChoice == 4) {
      gameCategory = "Real-Time Strategy";
    } else if (gameChoice == 5) {
      gameCategory = "Survival";
    } else {
      gameCategory = "Unknown";
    }
    countryName = JOptionPane.showInputDialog(null, "Enter your country", "Angely's Mini Online Game", JOptionPane.QUESTION_MESSAGE);
    //display player's details
    JOptionPane.showMessageDialog(null, "Player Name: " + playerName + "\nPlayer Age: " + playerAge + "\nPlayer Sex: " + sexChoice + "\nChosen Game: " + gameCategory + "\nCountry: " + countryName);

    //compute area of trapezoid using scanner
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the height of the trapezoid: ");
    double height = scan.nextDouble();

    System.out.println("\nEnter the length of the trapezoid: ");
    double length = scan.nextDouble();

    System.out.println("\nEnter the base of the trapezoid: ");
    double base = scan.nextDouble();

    double area = ((length + base) / 2) * height;
    System.out.format("\nThe area of the trapezoid is: %.2f", area);

    //compute area of ellipse using scanner
    System.out.println("\nEnter the distance in y axis: ");
    double a = scan.nextDouble();

    System.out.println("\nEnter the distance in x axis: ");
    double b = scan.nextDouble();

    double areaEllipse = Math.PI * a * b;
    System.out.format("\nThe area of the ellipse is: %.2f", areaEllipse);
  }
}