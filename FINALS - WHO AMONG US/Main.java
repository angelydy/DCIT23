import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Tasks ta = new Tasks();
        Terminal te = new TerminalEasy(1, 7,6, ta);
        Terminal tn = new TerminalNormal(2, 12,5, ta);
        Terminal th = new TerminalHard(3, 15,5);

        te.showTitle1();
        
        System.out.println("                                           ENTER YOUR NAME  ");
            System.out.print("                                               ");
            String name = sc.nextLine();
            Player p = new Player (name);

        System.out.println("\n\n                     ---------------- PRESS 1 TO START -------------------");
            System.out.print("                                               ");
        int playChoice = sc.nextInt();

        while (playChoice != 1){
            playChoice = sc.nextInt();
        }


        if (playChoice == 1){

            while (true){
                
                System.out.println("\n                 Enter your level of difficulty: [1] EASY [2] NORMAL [3] HARD  ");
                System.out.print("                                               ");
                int difficulty = sc.nextInt();

                switch (difficulty){
                    case 1: // terminal easy
                        System.out.println("\nDIFFICULTY: EASY");
                        te.greet(p);
                        System.out.println("\n");
                        te.showDesc();
                        te.actionBar(ta);
                        break;

                    case 2:  // terminal normal
                        System.out.println("\nDIFFICULTY: EASY");
                        tn.greet(p);
                        System.out.println("\n");
                        tn.showDesc();
                        tn.actionBar(ta);
                        break;
                        
                    case 3: // terminal hard 
                        th.greet(p);
                        System.out.println("\n");
                        th.showDesc();
                        break;
                    default: 
                        System.out.println("Invalid Input!");       
                }

                System.out.println("------- DO YOU WANT TO PLAY AGAIN? --------");
                playChoice = sc.nextInt();
            } 
        
        }

        
}
}


