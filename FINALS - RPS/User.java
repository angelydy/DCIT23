import java.util.Scanner;

public class User extends Player {

    private Scanner input;

    public User() {
        input = new Scanner(System.in);
    }

    public void selectChoice() {
        System.out.println("\n" + "Enter your choice: R - Rock, P - Paper, S - Scissors");
        setChoice(input.nextLine().toUpperCase());
    }
    
}