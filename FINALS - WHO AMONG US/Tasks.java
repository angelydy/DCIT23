    import java.util.*;
public class Tasks {
    
    public boolean status;

public void playQuizGame() {
    
    System.out.print("\n");
    System.out.println("\t  ██████╗ ██╗   ██╗██╗███████╗     ██████╗  █████╗ ███╗   ███╗███████╗");
    System.out.println("\t ██╔═══██╗██║   ██║██║╚══███╔╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝");
    System.out.println("\t ██║   ██║██║   ██║██║  ███╔╝     ██║  ███╗███████║██╔████╔██║█████╗  ");
    System.out.println("\t|██║▄▄ ██║██║   ██║██║ ███╔╝      ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ");
    System.out.println("\t╚██████╔╝ ╚██████╔╝██║███████╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗");
    System.out.println("\t ╚══▀▀═╝   ╚═════╝ ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝");
    System.out.print("\n");

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int quest = rand.nextInt(10)+1;

        switch(quest){
            case 1:
            System.out.println("There are three state of matter: Solid, Gas and?");
        
            while (true) {
            System.out.print("Please input your answer: ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("liquid")){
                System.out.println("You have entered an incorrect answer.");
                status = false;
            }
            else {
                System.out.println("You have entered a correct answer.");
                status = true;
                break;
            }
        }
            break;

            case 2:
            System.out.println("The first odd numbers are 1,3,5,7 and ?");
            
            while (true) {
                System.out.print("Please input your answer: ");
                int answer = input.nextInt();
                if (answer != 9){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 3:
            System.out.println("Soft:Hard ; Cold: ");
        
            while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("hot")){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 4:
            System.out.println("In a jack n poy game, Scissor can win against? ");
    
             while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("paper")){
                System.out.println("You have entered an incorrect answer.");
                status = false;
                }
                else {
                System.out.println("You have entered a correct answer.");
                status = true;
                break;
                }
            } 
            break;
            case 5:
            System.out.println("Give an even number.");
            
            while (true) {
                System.out.print("Please input your answer: ");
                int answer = input.nextInt();
                if (answer % 2 != 0){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 6:
            System.out.println("Pencil: Paper ; Chalk: ");
            
            while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("Blackboard")){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 7:
            System.out.println("In a jack n poy game, Stone can win against?");
            
            while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("scissor")){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 8:
            System.out.println("The three primary colors are red, blue, and? ");
            
            while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("yellow")){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 9:
            System.out.println("Plants need sunlight, nutrients(soil) and ___ to grow. ");
            
            while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("water")){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
            case 10:
            System.out.println(" What is the opposite of singular? ");
            
            while (true) {
                System.out.print("Please input your answer: ");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("plural")){
                    System.out.println("You have entered an incorrect answer.");
                    status = false;
                }
                else {
                    System.out.println("You have entered a correct answer.");
                    status = true;
                    break;
                }
            } 
            break;
        }   
        
    }

public void jumbledWords() {

    System.out.print("\n");
    System.out.println("\t    ██╗██╗   ██╗███╗   ███╗██████╗ ██╗     ███████╗██████╗     ██╗    ██╗ ██████╗ ██████╗ ██████╗ ███████╗");
    System.out.println("\t    ██║██║   ██║████╗ ████║██╔══██╗██║     ██╔════╝██╔══██╗    ██║    ██║██╔═══██╗██╔══██╗██╔══██╗██╔════╝");
    System.out.println("\t    ██║██║   ██║██╔████╔██║██████╔╝██║     █████╗  ██║  ██║    ██║ █╗ ██║██║   ██║██████╔╝██║  ██║███████╗");
    System.out.println("\t██  ██║██║   ██║██║╚██╔╝██║██╔══██╗██║     ██╔══╝  ██║  ██║    ██║███╗██║██║   ██║██╔══██╗██║  ██║╚════██║");
    System.out.println("\t╚█████╔╝╚██████╔╝██║ ╚═╝ ██║██████╔╝███████╗███████╗██████╔╝   ╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝███████║");
    System.out.println("\t╚════╝  ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚══════╝╚══════╝╚═════╝      ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝");
    System.out.print("\n");


    String word = "";
    String[] words = {"apple", "banana", "orange", "coconut", "strawberry", "raspberry", "blueberry", "blackberry", 
        "cherry", "grape", "kiwi", "mango", "papaya", "pineapple", "watermelon"};
    int wordIndex = (int) (Math.random() * words.length);
    word = words[wordIndex];
    String jumble = word.toLowerCase();
    char[] letters = jumble.toCharArray();
    for (int i = 0; i < letters.length; i++) {
      int index1 = (int) (Math.random() * letters.length);
      int index2 = (int) (Math.random() * letters.length);
      char temp = letters[index1];
      letters[index1] = letters[index2];
      letters[index2] = temp;
    }
    
    String jumbleWord = new String(letters);
    System.out.println("||--------------------------------------------||");
    System.out.println("\tThe jumble word is: " + jumbleWord);
    System.out.println("||--------------------------------------------||");
    System.out.println("||--------------------------------------------||");
    System.out.println("\tCan you guess the original word?");
    System.out.println("||--------------------------------------------||\n");
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine();
    guess = guess.toLowerCase();
    if (guess.equals(word)) {
      System.out.println("\n||--------------------------------------------||");
      System.out.println("That's it! You guessed the original word!");
      status = true;
    } else {
      System.out.println("\n||--------------------------------------------||");
      System.out.println("Sorry, that's not it. The word is " + word + ".");
      status = false;
    }
}

public void riddleGame(){
       
        System.out.print("\n");
        System.out.println("\t██████╗ ██╗██████╗ ██████╗ ██╗     ███████╗     ██████╗  █████╗ ███╗   ███╗███████╗██╗");
        System.out.println("\t██╔══██╗██║██╔══██╗██╔══██╗██║     ██╔════╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██║");
        System.out.println("\t██████╔╝██║██║  ██║██║  ██║██║     █████╗      ██║  ███╗███████║██╔████╔██║█████╗  ██║");
        System.out.println("\t██╔══██╗██║██║  ██║██║  ██║██║     ██╔══╝      ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚═╝");
        System.out.println("\t██║  ██║██║██████╔╝██████╔╝███████╗███████╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗██╗");
        System.out.print("\n");

        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*10) + 1;
        String guess;

        System.out.println("+------------------------------------Welcome to The Riddle------------------------------+");
        System.out.println("+            In order to complete the task, you must guess the right answer             +");
        System.out.println("+---------------------------------------------------------------------------------------+\n");

        switch (num){
            case 1: 
                String answer1 = "M";
                System.out.print("What comes once in a minute, twice in a moment, but never in a thousand years? ");
                guess = sc.nextLine();         

                    if (guess.equalsIgnoreCase(answer1)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer1){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
                break;
 
            case 2:
                String answer2 = "Luffy";
                System.out.print("Luffy's mother has three sons: Ace, Sabo, and? ");
                guess = sc.nextLine();

                    if (guess.equalsIgnoreCase(answer2)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer2){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
                break;

            case 3:
                String answer3 = "Table";
                System.out.print("What has legs but cannot walk? ");
                guess = sc.nextLine();               
         
                    if (guess.equalsIgnoreCase(answer3)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer3){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
                break;

            case 4:
                String answer4 = "comb";
                System.out.print("What has teeth but cannot bite? ");
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer4)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer4){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;

            case 5:
                String answer5 = "W";
                System.out.print("What is at the end of the rainbow? ");
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer5)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer5){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;

            case 6:
                String answer6 = "heart";
                System.out.print("It is not in your tummy but somewhere above. It is thought by many to be the symbol of love. What am I? ");
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer6)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer6){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;

            case 7:
                String answer7 = "keyboard";
                System.out.print("It has keys, but no locks. It has space, but no room. You can enter, but can’t go inside. What is it? ");
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer7)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer7){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;

            case 8:
                String answer8= "phone";
                System.out.print("What do you answer even though it never asks you questions? ");
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer8)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer8){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;

            case 9:
                String answer9= "g";
                System.out.print("What is the end of everything? ");
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer9)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer9){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;

            case 10:
                String answer10= "ton";
                System.out.print("What is heavy going forward but not going backwards?" );
                guess = sc.nextLine();
                    if (guess.equalsIgnoreCase(answer10)) {
                        System.out.println("\n+-----------------------------------+");
                        System.out.println("+ Great! You've Completed the task! +");
                        System.out.println("+-----------------------------------+");
                        status = true;
                        break;
                    }
                    else if (guess != answer10){               
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("+ Wrong answer, Better Luck Next Time! +"); 
                        System.out.println("+--------------------------------------+");
                        status = false;
                        break;
                    }
            break;
        }
    

}

public void mathGame(){

    System.out.print("\n");
        System.out.print("\t █████╗ ██████╗ ██╗████████╗██╗  ██╗███╗   ███╗███████╗████████╗██╗ ██████╗     ██████╗  █████╗ ███╗   ███╗███████╗\n");
        System.out.print("\t██╔══██╗██╔══██╗██║╚══██╔══╝██║  ██║████╗ ████║██╔════╝╚══██╔══╝██║██╔════╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝\n");
        System.out.print("\t███████║██████╔╝██║   ██║   ███████║██╔████╔██║█████╗     ██║   ██║██║         ██║  ███╗███████║██╔████╔██║█████╗  \n");
        System.out.print("\t██╔══██║██╔══██╗██║   ██║   ██╔══██║██║╚██╔╝██║██╔══╝     ██║   ██║██║         ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  \n");
        System.out.print("\t██║  ██║██║  ██║██║   ██║   ██║  ██║██║ ╚═╝ ██║███████╗   ██║   ██║╚██████╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗\n");
        System.out.print("\t╚═╝  ╚═╝╚═╝  ╚═╝╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝   ╚═╝   ╚═╝ ╚═════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝\n");
        System.out.print("\n");
   
    
    Scanner sc = new Scanner(System.in);
        int i;
        int life = 1;
        int num = (int) (Math.random()*10) + 1;
        int guess;
        
        System.out.print("\n---------------------------------------------------------\n\n");
		System.out.print("    Answer the Math question to save crew members!\n\n");
		System.out.print("---------------------------------------------------------\n\n");
		
		switch (num){
        case 1: 
            int answer1 = 127;
            System.out.println("Find the 11th term of the arithmethic sequence\n");
            System.out.print("= 7, 19, 31, 43, 55...\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
            for (i = 0; i < life;) {
     
                if (guess == answer1) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                if (guess != answer1){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 2:
        	int answer2 = 114;
            System.out.println("Solve : 9 (14 + 7) - 75 \n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer2) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer2){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 3:
        	int answer3 = 11;
            System.out.println("Solve : 15 - 1 (12 / 4 + 1)\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer3) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
               
                
                if (guess != answer3){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }  
           }
            break;
        case 4:
        	int answer4 = 15;
            System.out.println("Find x :  13 + (6 - 2) / 2 = x\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer4) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer4){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 5:
        	int answer5 = 87;
            System.out.println("Find x :  6 (12 - 5) + 9 (3 + 2) = x\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer5) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer5){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;   
        case 6:
        	int answer6 = 24;
            System.out.println("Find x :  14 + 10 (2 + 3) / 5 = x\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer6) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer6){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 7:
        	int answer7 = 8;
            System.out.println("Solve : 4 + 8 (15 - 7) / 2 (2 + 6)\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer7) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer7){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 8:
        	int answer8 = 35;
            System.out.println("Solve :  (6 / 2) + 4 x 10 - (16 / 2)\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer8) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer8){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 9:
        	int answer9 = 22;
            System.out.println("If x = 5 :  2 + 3 (5x - 20) + 10 / 2\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer9) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer9){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
        case 10:
        	int answer10 = 13;
            System.out.println("If x = 2; y = 3 :  2y + 3 (2 + 6x) / 3x\n\n");
            System.out.print("My answer: ");
            guess = sc.nextInt();
         
            for (i = 0; i < life;) {
                
                if (guess == answer10) {
                    System.out.println("\n--------------------- You're Right! ---------------------\n");
                    status = true;
                    break;
                }
                    
                if (guess != answer10){
                    System.out.println("\n--------------------- Wrong Answer! ---------------------");
                    status = false;
                    break;
                    }
                }
            break;
       // closing tags 
       }
   }
}


