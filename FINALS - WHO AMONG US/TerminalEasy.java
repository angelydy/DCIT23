    import java.util.*;
public class TerminalEasy extends Terminal {  //abstracts to Terminal.java
    
    
    Scanner sc= new Scanner(System.in);
    int impostorNum;
    int crewNum;
    int tasksNum;
    
    
    TerminalEasy (int impostorNum, int crewNum, int tasksNum, Tasks ta){   //Constructors
        this.impostorNum = impostorNum;
        this.crewNum = crewNum;
        this.tasksNum = tasksNum;
    }
    

    // Greeting the User (will change the appearance soon)
    public void greet(Player p){
        System.out.println('\n');    
        System.out.println("\t\t\t Hi " + p.name + "! Welcome aboard.");
    }
    
    //Displaying Game Description 
    public void showDesc(){
        System.out.println("\"Your task is to find " +impostorNum + " impostors among the crewmembers aboard\"\n" +
    "You will have the opportunity to guess if you answer/finish a task successfully.\"\n" +
    "Be careful because the impostor is also going to hunt a person every round \"\n" +
    " If you are lucky, you can surely select who is/are the impostor(s). Goodluck \"\n");        
    }

    //method that hold most of the process
    public void actionBar(Tasks ta){

        // Creating an Array for the Crewmember List
        String crewMemberEasy [] = {"Madeline", "Austin", "Sero", "Bindy", "Louie", "Mikey", "Becky"};
        String crewMemberEasy1 [] = {"Madeline", "Austin", "Sero", "Bindy", "Louie", "Mikey", "Becky"}; // create new to maintain the name of the crew
        ArrayList crewmembers = new ArrayList();

        //Randomizing the Impostor
        Random rand = new Random();
        
        //Impostor Variable
        int impostorGen = rand.nextInt(crewMemberEasy.length);
        
        //System.out.println(crewMemberEasy[impostorGen]);  Remove to Preview the Impostor Before The Tasks 
        

        while (crewNum > 1){  // While loop that breaks once the crewnumber drops to 1

            showActionBar();
            System.out.println("");
            System.out.print("Enter an action number: ");   // Getting actions from user
            int actionNum = sc.nextInt();

            if (actionNum == 1){        // ACTION 1 = Show Crewmember list specified whether [DEAD] or [EJECTED]
                System.out.println(crewmembers);
                System.out.println("\n");
                System.out.println("--------CREWMEMBER LIST-------");
                for (int i = 0 ; i < crewMemberEasy.length; i++){
                    System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                }
                System.out.println('\n');

            }
            
            else if (actionNum == 2){   // ACTION 2 = Doing Tasks (Randomly)
                int playerTask = (int)(Math.random()* 4);

                if (tasksNum > 0 && crewNum > 1){

                    if (playerTask == 0){
                        ta.playQuizGame();  // Calling out Quiz Game
                        
                        if ( ta.status == true ) {
                            tasksNum -=1;
                            tasksDone += 1;

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }
                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                            System.out.print( "Insert the index of who you think the impostor is:  ");  // User can have the power to eject crew
                            int impostorGuess = sc.nextInt();

                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberEasy1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    break;
                                }
                            }

                                if (impostorGuess != impostorGen){  // If not the impostor, The crew will be declared [EJECTED] 
                                    System.out.println(crewMemberEasy[impostorGuess] + " is not the impostor!");
                                    crewMemberEasy[impostorGuess] = crewMemberEasy[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
                                    
                                    crewNum -= 1;
                                    System.out.println("\n");
                                    System.out.println("Number of Crewmates Left: " + crewNum);                       

                                }
                                else if (impostorGuess == impostorGen){ // Else, The User won and reveals the Impostor
                                    System.out.println("Congratulations You Won! " + crewMemberEasy[impostorGen] + " is the impostor");
                                    break;
                                }
                        }
                        else {
                            System.out.println("YOU FAILED A TASK! You cannott guess in this round. \n");

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                        }      
                    }

                    // The next part is almost the same with this part so no need to explain
                    
                    else if (playerTask == 1){
                        ta.jumbledWords();
                        if ( ta.status == true ) {
                            tasksNum -=1;
                            tasksDone += 1;

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                            System.out.print( "Insert the index of who you think the impostor is:  ");  // User can have the power to eject crew
                            int impostorGuess = sc.nextInt();

                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberEasy1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    break;
                                }
                            }

                                if (impostorGuess != impostorGen){  // If not the impostor, The crew will be declared [EJECTED] 
                                    System.out.println(crewMemberEasy[impostorGuess] + " is not the impostor!");
                                    crewMemberEasy[impostorGuess] = crewMemberEasy[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
                                    
                                    crewNum -= 1;
                                    System.out.println("\n");
                                    System.out.println("Number of Crewmates Left: " + crewNum);                       

                                }
                                else if (impostorGuess == impostorGen){ // Else, The User won and reveals the Impostor
                                    System.out.println("Congratulations You Won! " + crewMemberEasy[impostorGen] + " is the impostor");
                                    break;
                                }
                        }
                        else {
                            System.out.println("YOU FAILED A TASK! You cannott guess in this round. \n");

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                        }
                }     
                    
                    else if (playerTask == 2){
                        ta.riddleGame();
                        if ( ta.status == true ) {
                            tasksNum -=1;
                            tasksDone += 1;

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                            System.out.print( "Insert the index of who you think the impostor is:  ");  // User can have the power to eject crew
                            int impostorGuess = sc.nextInt();

                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberEasy1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    break;
                                }
                            }

                                if (impostorGuess != impostorGen){  // If not the impostor, The crew will be declared [EJECTED] 
                                    System.out.println(crewMemberEasy[impostorGuess] + " is not the impostor!");
                                    crewMemberEasy[impostorGuess] = crewMemberEasy[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
                                    
                                    crewNum -= 1;
                                    System.out.println("\n");
                                    System.out.println("Number of Crewmates Left: " + crewNum);                       

                                }
                                else if (impostorGuess == impostorGen){ // Else, The User won and reveals the Impostor
                                    System.out.println("Congratulations You Won! " + crewMemberEasy[impostorGen] + " is the impostor");
                                    break;
                                }
                        }
                        else {
                            System.out.println("YOU FAILED A TASK! You cannott guess in this round. \n");

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                        }
                    }     

                    else if (playerTask == 3){
                        ta.mathGame();
                        if ( ta.status == true ) {
                            tasksNum -=1;
                            tasksDone += 1;

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                            System.out.print( "Insert the index of who you think the impostor is:  ");  // User can have the power to eject crew
                            int impostorGuess = sc.nextInt();

                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberEasy1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    break;
                                }
                            }

                                if (impostorGuess != impostorGen){  // If not the impostor, The crew will be declared [EJECTED] 
                                    System.out.println(crewMemberEasy[impostorGuess] + " is not the impostor!");
                                    crewMemberEasy[impostorGuess] = crewMemberEasy[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
                                    
                                    crewNum -= 1;
                                    System.out.println("\n");
                                    System.out.println("Number of Crewmates Left: " + crewNum);                       

                                }
                                else if (impostorGuess == impostorGen){ // Else, The User won and reveals the Impostor
                                    System.out.println("Congratulations You Won! " + crewMemberEasy[impostorGen] + " is the impostor");
                                    break;
                                }
                        }
                        else {
                            System.out.println("YOU FAILED A TASK! You cannott guess in this round. \n");

                            int crewKiller = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            while(true){    // Loop that Limits the repitition of killed crew and suiciding impostors
                                if (crewmembers.contains(crewKiller)){ // check wheter the crew is already dead
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if (crewKiller == impostorGen){
                                    crewKiller = (int)(Math.random()* crewNum);
                                }

                                if(!crewmembers.contains(crewKiller) && crewKiller != impostorGen){
                                    crewmembers.add(crewKiller); 
                                    break;
                                }

                            }         
                            
                            System.out.println("Remaining Task(s): " + tasksNum);


                            System.out.println( crewMemberEasy[crewKiller]  + " has been killed");
                            crewNum -= 1;
                            crewMemberEasy[crewKiller] = crewMemberEasy[crewKiller] + " [DEAD]"; 

                            System.out.println( " ");
                            System.out.println("List of Crewmembers: ");
                            
                            for (int i = 0 ; i < crewMemberEasy.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberEasy[i]);
                            }

                            System.out.println('\n');

                        }
                    }     
                }
            }
            
            else if (actionNum == 3){   // Showing Task Manager
                System.out.println("Task Manager");
                System.out.println("NUmber of Task(s) Completed: " + tasksDone);
                System.out.println("Remaining Number of Task(s): " + tasksNum);
            }
            
            else{
                System.out.println("Invalid Action Number!");
            } 
        }

        if (crewNum == 1){  // Showing the Impostor if Lost
            System.out.println("You Lose! " + crewMemberEasy[impostorGen] +" is the Impostor\n ");
            
        }
    }

} 