    import java.util.*;
public abstract class Terminal {
    
    int tasksDone = 0;
    
    abstract void greet (Player p);
    abstract void showDesc ();
    abstract void actionBar (Tasks ta);
    

    public void showTitle(){
        System.out.println("_____________________________________________________________________________________________________________________");
        System.out.println("|  ________________________________________________________________________________________________________________  |");
        System.out.println("| |                                                                                                                | |");
        System.out.println("| |   ██╗    ██╗██╗  ██╗ ██████╗      █████╗ ███╗   ███╗ ██████╗ ███╗   ██╗ ██████╗     ██╗   ██╗███████╗██████╗   | |");
        System.out.println("| |   ██║    ██║██║  ██║██╔═══██╗    ██╔══██╗████╗ ████║██╔═══██╗████╗  ██║██╔════╝     ██║   ██║██╔════╝╚════██╗  | |");
        System.out.println("| |   ██║ █╗ ██║███████║██║   ██║    ███████║██╔████╔██║██║   ██║██╔██╗ ██║██║  ███╗    ██║   ██║███████╗  ▄███╔╝  | |");
        System.out.println("| |   ██║███╗██║██╔══██║██║   ██║    ██╔══██║██║╚██╔╝██║██║   ██║██║╚██╗██║██║   ██║    ██║   ██║╚════██║  ▀▀══╝   | |");
        System.out.println("| |   ╚███╔███╔╝██║  ██║╚██████╔╝    ██║  ██║██║ ╚═╝ ██║╚██████╔╝██║ ╚████║╚██████╔╝    ╚██████╔╝███████║  ██╗     | |");
        System.out.println("| |    ╚══╝╚══╝ ╚═╝  ╚═╝ ╚═════╝     ╚═╝  ╚═╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝      ╚═════╝ ╚══════╝  ╚═╝     | |");  
        System.out.println("| |                                                                                                                | |");
        System.out.println("| |                                   ----Press Enter to continue-----                                             | |");
        System.out.println("| |                                                                                                                | |");
        System.out.println("| |________________________________________________________________________________________________________________| |");
        System.out.println("|____________________________________________________________________________________________________________________|");
        System.out.print("");
        try{System.in.read();}
        catch(Exception e){}
    }

    public void showTitle1(){
             	System.out.print("\n");
		System.out.print(" _____________________________________________________________________________________________________________\n|                                                                                                             |");
		System.out.print("\n|                                                                                                             |\n");
		System.out.print("|      █     █░ ██░ ██  ▒█████      ▄▄▄       ███▄ ▄███▓ ▒█████   ███▄    █   ▄████     █    ██   ██████      |\n");
		System.out.print("|     ▓█░ █ ░█░▓██░ ██▒▒██▒  ██▒   ▒████▄    ▓██▒▀█▀ ██▒▒██▒  ██▒ ██ ▀█   █  ██▒ ▀█▒    ██  ▓██▒▒██    ▒      |\n");
		System.out.print("|     ▒█░ █ ░█ ▒██▀▀██░▒██░  ██▒   ▒██  ▀█▄  ▓██    ▓██░▒██░  ██▒▓██  ▀█ ██▒▒██░▄▄▄░   ▓██  ▒██░░ ▓██▄        |\n");
		System.out.print("|     ░█░ █ ░█ ░▓█ ░██ ▒██   ██░   ░██▄▄▄▄██ ▒██    ▒██ ▒██   ██░▓██▒  ▐▌██▒░▓█  ██▓   ▓▓█  ░██░  ▒   ██▒     |\n");
		System.out.print("|     ░░██▒██▓ ░▓█▒░██▓░ ████▓▒░    ▓█   ▓██▒▒██▒   ░██▒░ ████▓▒░▒██░   ▓██░░▒▓███▀▒   ▒▒█████▓ ▒██████▒▒     |\n");
		System.out.print("|     ░ ▓░▒ ▒   ▒ ░░▒░▒░ ▒░▒░▒░     ▒▒   ▓▒█░░ ▒░   ░  ░░ ▒░▒░▒░ ░ ▒░   ▒ ▒  ░▒   ▒    ░▒▓▒ ▒ ▒ ▒ ▒▓▒ ▒ ░     |\n");
		System.out.print("|       ▒ ░ ░   ▒ ░▒░ ░  ░ ▒ ▒░      ▒   ▒▒ ░░  ░      ░  ░ ▒ ▒░ ░ ░░   ░ ▒░  ░   ░    ░░▒░ ░ ░ ░ ░▒  ░ ░     |\n");
		System.out.print("|       ░   ░   ░  ░░ ░░ ░ ░ ▒       ░   ▒   ░      ░   ░ ░ ░ ▒     ░   ░ ░ ░ ░   ░     ░░░ ░ ░ ░  ░  ░       |\n");
		System.out.print("|         ░     ░  ░  ░    ░ ░           ░  ░       ░       ░ ░           ░       ░       ░           ░       |\n");
		System.out.print("|                                                                                                             |\n");
		System.out.print("|     -----     -----     -----     -----     The Console Version     -----     -----     -----     -----     |\n");
		System.out.print("|                                                                                                             |\n");
		System.out.print("|_____________________________________________________________________________________________________________|\n");
		System.out.print("\n");

    }

    public void crewMembers(){
    
     ArrayList crewmembers = new ArrayList();
        crewmembers.add("Madeline");  
        crewmembers.add("Austin");
        crewmembers.add("Sero");
        crewmembers.add("Bindy");
        crewmembers.add("Louie");
        crewmembers.add("Mikey");
        crewmembers.add("Beckey");
        crewmembers.add("Carl");
        crewmembers.add("Daniel");
        crewmembers.add("Michael");
        crewmembers.add("Anna");
        crewmembers.add("Nick");
        crewmembers.add("Princess");
        crewmembers.add("Darlene");
        crewmembers.add("Jones");
       
    }
    
    public void showActionBar(){
        System.out.println("[1] Show Crewmember Lists ");
        System.out.println("[2] Do a task");
        System.out.println("[3] Task Manager");
    
    }
    

    
   
    int impostorInd = (int)(Math.random()* 15);
                     

    
    
    
    
    
   }