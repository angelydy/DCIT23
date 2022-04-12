import java.util.Scanner;

public class getUserName {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scan.nextLine();
    
    stringName sn = new stringName();
    sn.splitName(name);
  }
}
