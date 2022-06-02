import java.util.Scanner;

public class Game {
    private User p1;
    private User p2;
    private int player1Wins;
    private int player2Wins;
    private int player1Loses;
    private int player2Loses;
    private int ties;
    private boolean isRunning = false;
    private Scanner scan;

    public Game() {
        p1 = new User();
        p2 = new User();
        scan = new Scanner(System.in);
        start();
    }

    private void start() {
        isRunning = true;
        System.out.print("\n" + "Player1 enter your name: ");
        p1.setName(scan.nextLine());
        System.out.println();
        System.out.print("Player2 enter your name: ");
        p2.setName(scan.nextLine());
        

        while(isRunning) {
            p1.selectChoice();
            p2.selectChoice();
            displayChoices();
            displayWinner(decideWinner());
            updateScore(decideWinner());
            displayScore();
            playAgain();
        }
    }
    /*private void chooseLevel(){
        p1.selectChoice();
        p2.selectChoice();
        System.out.println("----------");
        System.out.println("1. Easy" );
        System.out.println("2. Medium" );
        System.out.println("3. Hard"  );
        System.out.println("----------" + "\n");   

        if(p1.getChoice().equals("1") || p2.getChoice().equals("1")){
            return ; instantiate easy level
        } 
        else if(p1.getChoice().equals("2") || p2.getChoice().equals("2")){
            return ; instantiate medium level
        }
        else if(p1.getChoice().equals("3") || p2.getChoice().equals("3")){
            return ; instantiate hard level
        }
        else{
            // print selectChoice
        }
    }*/

    private void displayScore() {
        System.out.println("\n" + p1.getName());
        System.out.println("----------");
        System.out.println("Wins: " + player1Wins);
        System.out.println("Loses: " + player1Loses);
        System.out.println("Ties: " + ties);
        System.out.println("----------" + "\n");

        System.out.println("\n" + p2.getName());
        System.out.println("----------");
        System.out.println("Wins: " + player2Wins);
        System.out.println("Loses: " + player2Loses);
        System.out.println("Ties: " + ties);
        System.out.println("----------" + "\n");
    }

    private int decideWinner() {
        // 0 - User wins
        // 1 - Computer wins
        // 2 - tie

        if(p1.getChoice().equals("R") && p2.getChoice().equals("S")){
            return 0;
        }
        else if(p1.getChoice().equals("P") && p2.getChoice().equals("R")){
            return 0;
        } 
        else if(p1.getChoice().equals("S") && p2.getChoice().equals("P"))
            return 0;
        else if( p2.getChoice().equals("R") && p1.getChoice().equals("S"))
            return 1;
        else if( p2.getChoice().equals("P") && p1.getChoice().equals("R"))
            return 1;
        else if( p2.getChoice().equals("S") && p1.getChoice().equals("P"))
            return 1;
        else 
            return 2;
    }

    private void displayChoices() {
        System.out.println(p1.getName() + " has selected: " + p1.getChoice());
        System.out.println(p2.getName() + " has selected: " + p2.getChoice());
    }

    private void displayWinner(int winner) {
        switch(winner) {
            case 0:
                System.out.println(p1.getName() + " has won!");
                break;
            case 1:
                System.out.println(p2.getName() + " has won!");
                break;
            case 2:
                System.out.println("It is a tie!");
        }
    }

    private void playAgain() {
        String choice;
        System.out.println("Do you want to play again? Enter Yes to play again.");
        choice = scan.nextLine();
        if(!(choice.toUpperCase().equals("YES") ))
            isRunning = false;

    }

    private void updateScore(int winner) {
        if(winner == 0)
            player1Wins++;
        else if(winner == 1)
            player2Wins++;  
        else if(winner == 2)
            ties++;
    }
    
    
       
}