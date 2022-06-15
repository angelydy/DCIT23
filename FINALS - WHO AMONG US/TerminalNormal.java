    import java.util.*;
public class TerminalNormal extends Terminal {
    Scanner sc= new Scanner(System.in);

    int impostorNum;
    int crewNum;
    int tasksNum;
    
    
    TerminalNormal (int impostorNum, int crewNum, int tasksNum, Tasks ta){
        this.impostorNum = impostorNum;
        this.crewNum = crewNum;
        this.tasksNum = tasksNum;
    
    }
    public void greet(Player p){
        System.out.println('\n');    
        System.out.println("Hi " + p.name + "! Welcome aboard.");;
    }
    public void showDesc(){
        System.out.println("\"Your task is to find " +impostorNum + " impostors among the crewmembers aboard\"\n" +
        "You will have the opportunity to guess if you answer/finish a task successfully.\"\n" +
        "Be careful because the impostor is also going to hunt a person every round \"\n" +
        " If you are lucky, you can surely select who is/are the impostor(s). Goodluck \"\n");        
        }
    
        public void actionBar(Tasks ta){
    
        String crewMemberNormal [] = {"Madeline", "Austin", "Sero", "Bindy", "Louie", "Mikey", "Becky",
                                        "Carl", "Daniel", "Michael", "Anna", "Nick"};
        String crewMemberNormal1 [] = {"Madeline", "Austin", "Sero", "Bindy", "Louie", "Mikey", "Becky",
                                        "Carl", "Daniel", "Michael", "Anna", "Nick"}; // create new to maintain the name of the crew
        ArrayList crewmembers = new ArrayList();               
        Random rand = new Random();

        int impostorGen1 = rand.nextInt(crewMemberNormal.length);
        int impostorGen2 = rand.nextInt(crewMemberNormal.length);

        while(impostorGen1 == impostorGen2){
            impostorGen1 = rand.nextInt(crewMemberNormal.length);
            impostorGen2 = rand.nextInt(crewMemberNormal.length);
        }
        
        System.out.println(crewMemberNormal[impostorGen1]);
        System.out.println(crewMemberNormal[impostorGen2]);

        while (crewNum > 3 && tasksNum > 0){
        
            showActionBar();
            System.out.println("");
            System.out.print("Enter an action number: ");
            int actionNum = sc.nextInt();

            if (actionNum == 1){
                //System.out.println(crewmembers);
                System.out.println("\n");
                System.out.println("--------CREWMEMBER LIST-------");
                for (int i = 0 ; i < crewMemberNormal.length; i++){
                    System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                }
                System.out.println('\n');

            }
            
            else if (actionNum == 2){
                
                int playerTask = (int)(Math.random()* 3);

                if (tasksNum > 0 && crewNum > 1){

                    if (playerTask == 0){
                        ta.playQuizGame();

                        if (ta.status == true) {
                            tasksNum -=1;
                            tasksDone += 1;

                            int crewKiller1 = (int)(Math.random()* crewNum);
                            int crewKiller2 = (int)(Math.random()* crewNum);

                            while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                crewKiller1 = (int)(Math.random()* crewNum);
                                crewKiller2 = (int)(Math.random()* crewNum);
                            }

                            if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                crewmembers.add(crewKiller1); 
                            }

                            if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                crewmembers.add(crewKiller2); 
                            }  
                        
                        
                        
                        System.out.println("Remaining Task(s): " + tasksNum);

                        System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 

                        System.out.println( " ");
                        System.out.println("List of Crewmembers: ");
                        
                        for (int i = 0 ; i < crewMemberNormal.length; i++){
                            System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                        }
                        System.out.println('\n');

                        System.out.print( "Insert the index of who you think the impostor is:  ");
                        int impostorGuess = sc.nextInt();

                        while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                            System.out.println(crewMemberNormal1[impostorGuess]+ " is already Dead \n");
                            System.out.print( "Insert the index of who you think the impostor is:  ");
                            impostorGuess = sc.nextInt();
                            
                            if (!crewmembers.contains(impostorGuess)){
                                crewmembers.add(impostorGuess);
                                break;
                            }
                        }
                            if (impostorGuess == impostorGen1 || impostorGuess == impostorGen2){
                                System.out.println(crewMemberNormal[impostorGuess] + " is ejected!");
                                System.out.println(crewMemberNormal[impostorGuess] + " is an impostor!");
                                crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED] [IMPOSTOR]"; 
                                crewmembers.add(impostorGuess);
                                impostorNum -= 1;
                            }

                            else if (impostorGuess != impostorGen1 || impostorGuess != impostorGen2){
                                System.out.println(crewMemberNormal[impostorGuess] + " is not the impostor!");
                                crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED]"; 
                                crewmembers.add(impostorGuess);

                                 crewNum -= 1;
                                 System.out.println("\n");
                                 System.out.println("Number of Crewmates Left: " + crewNum ); //shows the number of crew member left
                            }
                            
                            if(impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2 || impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2){
                                System.out.println("Congratulations You Won!\n");
                                for (int i = 0 ; i < crewMemberNormal.length; i++){
                                    System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                                }
                                break;
                            }

                        }
                        else {
                            System.out.println("YOU FAILED A TASK! You cannot guess in this round. \n");

                            int crewKiller1 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
                            int crewKiller2 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill

                            // Loop that Limits the repetition of killed crew and suiciding impostors
                            while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                crewKiller1 = (int)(Math.random()* crewNum);
                                crewKiller2 = (int)(Math.random()* crewNum);
                            }

                            if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                crewmembers.add(crewKiller1); 
                            }

                            if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                crewmembers.add(crewKiller2); 
                            }  
                            
                        System.out.println("Remaining Task(s): " + tasksNum);

                        System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 
                        crewmembers.add(crewKiller1);

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                        crewmembers.add(crewKiller2);
                        
                        for (int i = 0 ; i < crewMemberNormal.length; i++){
                            System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                        }
                        System.out.println('\n');

                        }
                    }
                    
                       else if (playerTask == 1){
                            ta.jumbledWords();
    
                            if (ta.status == true) {
                                tasksNum -=1;
                                tasksDone += 1;
    
                                int crewKiller1 = (int)(Math.random()* crewNum);
                                int crewKiller2 = (int)(Math.random()* crewNum);
                            
                                while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                    crewKiller1 = (int)(Math.random()* crewNum);
                                    crewKiller2 = (int)(Math.random()* crewNum);
                                }
    
                                if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                    crewmembers.add(crewKiller1); 
                                }
    
                                if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                    crewmembers.add(crewKiller2); 
                                }  
                            
                            System.out.println("Remaining Task(s): " + tasksNum);
    
                            System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                            
                            for (int i = 0 ; i < crewMemberNormal.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                            }
                            System.out.println('\n');
    
                            System.out.print( "Insert the index of who you think the impostor is:  ");
                            int impostorGuess = sc.nextInt();
    
                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberNormal1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    crewmembers.add(impostorGuess);
                                    break;
                                }
                            }
                                if (impostorGuess == impostorGen1 || impostorGuess == impostorGen2){
                                    System.out.println(crewMemberNormal[impostorGuess] + " is ejected!");
                                    System.out.println(crewMemberNormal[impostorGuess] + " is an impostor!");
                                    crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED] [IMPOSTOR]"; 
                                    crewmembers.add(impostorGuess);
                                    impostorNum -= 1;
                                }
    
                                else if (impostorGuess != impostorGen1 || impostorGuess != impostorGen2){
                                    System.out.println(crewMemberNormal[impostorGuess] + " is not the impostor!");
                                    crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
    
                                     crewNum -= 1;
                                     System.out.println("\n");
                                     System.out.println("Number of Crewmates Left: " + crewNum ); //shows the number of crew member left
                                }
                                
                                if(impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2 || impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2){
                                    System.out.println("Congratulations You Won!\n");
                                    for (int i = 0 ; i < crewMemberNormal.length; i++){
                                        System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                                    }
                                    break;
                                }
    
                            }
                            else {
                                System.out.println("YOU FAILED A TASK! You cannot guess in this round. \n");
    
                                int crewKiller1 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
                                int crewKiller2 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
    
                                // Loop that Limits the repetition of killed crew and suiciding impostors
                                while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                    crewKiller1 = (int)(Math.random()* crewNum);
                                    crewKiller2 = (int)(Math.random()* crewNum);
                                }
    
                                if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                    crewmembers.add(crewKiller1); 
                                }
    
                                if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                    crewmembers.add(crewKiller2); 
                                }  
                                
                            System.out.println("Remaining Task(s): " + tasksNum);
    
                            System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                            
                            for (int i = 0 ; i < crewMemberNormal.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                            }
                            System.out.println('\n');
    
                            }
                        }
                        
                        
                        else if (playerTask == 2){
                            ta.riddleGame();
    
                            if (ta.status == true) {
                                tasksNum -=1;
                                tasksDone += 1;
    
                                int crewKiller1 = (int)(Math.random()* crewNum);
                                int crewKiller2 = (int)(Math.random()* crewNum);
                            
                                while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                    crewKiller1 = (int)(Math.random()* crewNum);
                                    crewKiller2 = (int)(Math.random()* crewNum);
                                }
    
                                if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                    crewmembers.add(crewKiller1); 
                                }
    
                                if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                    crewmembers.add(crewKiller2); 
                                }  
                            
                            System.out.println("Remaining Task(s): " + tasksNum);
    
                            System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                            
                            for (int i = 0 ; i < crewMemberNormal.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                            }
                            System.out.println('\n');
    
                            System.out.print( "Insert the index of who you think the impostor is:  ");
                            int impostorGuess = sc.nextInt();
    
                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberNormal1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    crewmembers.add(impostorGuess);
                                    break;
                                }
                            }
                                if (impostorGuess == impostorGen1 || impostorGuess == impostorGen2){
                                    System.out.println(crewMemberNormal[impostorGuess] + " is ejected!");
                                    System.out.println(crewMemberNormal[impostorGuess] + " is an impostor!");
                                    crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED] [IMPOSTOR]"; 
                                    crewmembers.add(impostorGuess);
                                    impostorNum -= 1;
                                }
    
                                else if (impostorGuess != impostorGen1 || impostorGuess != impostorGen2){
                                    System.out.println(crewMemberNormal[impostorGuess] + " is not the impostor!");
                                    crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
    
                                     crewNum -= 1;
                                     System.out.println("\n");
                                     System.out.println("Number of Crewmates Left: " + crewNum ); //shows the number of crew member left
                                }
                                
                                if(impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2 || impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2){
                                    System.out.println("Congratulations You Won!\n");
                                    for (int i = 0 ; i < crewMemberNormal.length; i++){
                                        System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                                    }
                                    break;
                                }
    
                            }
                            else {
                                System.out.println("YOU FAILED A TASK! You cannot guess in this round. \n");
    
                                int crewKiller1 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
                                int crewKiller2 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
    
                                // Loop that Limits the repetition of killed crew and suiciding impostors
                                while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                    crewKiller1 = (int)(Math.random()* crewNum);
                                    crewKiller2 = (int)(Math.random()* crewNum);
                                }
    
                                if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                    crewmembers.add(crewKiller1); 
                                }
    
                                if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                    crewmembers.add(crewKiller2); 
                                }  
                                
                            System.out.println("Remaining Task(s): " + tasksNum);
    
                            System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                            
                            for (int i = 0 ; i < crewMemberNormal.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                            }
                            System.out.println('\n');
    
                            }
                        }

                        else if (playerTask == 3){
                            ta.mathGame();
    
                            if (ta.status == true) {
                                tasksNum -=1;
                                tasksDone += 1;
    
                                int crewKiller1 = (int)(Math.random()* crewNum);
                                int crewKiller2 = (int)(Math.random()* crewNum);
                            
                                while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                    crewKiller1 = (int)(Math.random()* crewNum);
                                    crewKiller2 = (int)(Math.random()* crewNum);
                                }
    
                                if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                    crewmembers.add(crewKiller1); 
                                }
    
                                if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                    crewmembers.add(crewKiller2); 
                                }  
                            
                            System.out.println("Remaining Task(s): " + tasksNum);
    
                            System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                            
                            for (int i = 0 ; i < crewMemberNormal.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                            }
                            System.out.println('\n');
    
                            System.out.print( "Insert the index of who you think the impostor is:  ");
                            int impostorGuess = sc.nextInt();
    
                            while(crewmembers.contains(impostorGuess)){   /// loop that limits the user in killing the dead or ejected people
                                System.out.println(crewMemberNormal1[impostorGuess]+ " is already Dead \n");
                                System.out.print( "Insert the index of who you think the impostor is:  ");
                                impostorGuess = sc.nextInt();
                                
                                if (!crewmembers.contains(impostorGuess)){
                                    crewmembers.add(impostorGuess);
                                    break;
                                }
                            }
                                if (impostorGuess == impostorGen1 || impostorGuess == impostorGen2){
                                    System.out.println(crewMemberNormal[impostorGuess] + " is ejected!");
                                    System.out.println(crewMemberNormal[impostorGuess] + " is an impostor!");
                                    crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED] [IMPOSTOR]"; 
                                    crewmembers.add(impostorGuess);
                                    impostorNum -= 1;
                                }
    
                                else if (impostorGuess != impostorGen1 || impostorGuess != impostorGen2){
                                    System.out.println(crewMemberNormal[impostorGuess] + " is not the impostor!");
                                    crewMemberNormal[impostorGuess] = crewMemberNormal[impostorGuess] + " [EJECTED]"; 
                                    crewmembers.add(impostorGuess);
    
                                     crewNum -= 1;
                                     System.out.println("\n");
                                     System.out.println("Number of Crewmates Left: " + crewNum ); //shows the number of crew member left
                                }
                                
                                if(impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2 || impostorNum == 0 && impostorGuess == impostorGen1 || impostorNum == 0 && impostorGuess == impostorGen2){
                                    System.out.println("Congratulations You Won!\n");
                                    for (int i = 0 ; i < crewMemberNormal.length; i++){
                                        System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                                    }
                                    break;
                                }
    
                            }
                            else {
                                System.out.println("YOU FAILED A TASK! You cannot guess in this round. \n");
    
                                int crewKiller1 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
                                int crewKiller2 = (int)(Math.random()* crewNum); // Impostor will try to randomly kill
    
                                // Loop that Limits the repetition of killed crew and suiciding impostors
                                while (crewKiller1 == crewKiller2 || crewmembers.contains(crewKiller1) || crewmembers.contains(crewKiller2) || crewKiller1 == impostorGen1 || crewKiller2 ==impostorGen2 || crewKiller1 == impostorGen2 || crewKiller2 == impostorGen1 || crewKiller1 == crewKiller2 && crewKiller2 == crewKiller1){
                                    crewKiller1 = (int)(Math.random()* crewNum);
                                    crewKiller2 = (int)(Math.random()* crewNum);
                                }
    
                                if(!crewmembers.contains(crewKiller1) || crewKiller1 != impostorGen1 || !crewmembers.contains(crewKiller1) ||crewKiller2 != crewKiller1){
                                    crewmembers.add(crewKiller1); 
                                }
    
                                if(!crewmembers.contains(crewKiller2) || crewKiller2 != impostorGen2 || !crewmembers.contains(crewKiller2) || crewKiller1 != crewKiller2){
                                    crewmembers.add(crewKiller2); 
                                }  
                                
                            System.out.println("Remaining Task(s): " + tasksNum);
    
                            System.out.println( crewMemberNormal[crewKiller1]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller1] = crewMemberNormal[crewKiller1] + " [DEAD]"; 

                        System.out.println( crewMemberNormal[crewKiller2]  + " has been killed");
                        crewNum -= 1;
                        crewMemberNormal[crewKiller2] = crewMemberNormal[crewKiller2] + " [DEAD]"; 
                            
                            for (int i = 0 ; i < crewMemberNormal.length; i++){
                                System.out.println("CrewMember No. [ "+i+" ] " + crewMemberNormal[i]);
                            }
                            System.out.println('\n');
    
                            }
                        }
                }
            }
            
            else if (actionNum == 3){
                System.out.println("Task Manager");
                System.out.println("Number of Task(s) Completed: " + tasksDone);
                System.out.println("Remaining Number of Task(s): " + tasksNum);
            }
            
            else{
                System.out.println("Invalid Action Number!");
            } 
        }

        if (crewNum <= 1){
            System.out.println("You Lose!" + crewMemberNormal[impostorGen1] +" and "+ crewMemberNormal[impostorGen1] + " are the Impostor\n ");
        }
   
}
}
       
        



        