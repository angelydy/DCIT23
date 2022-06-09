    import java.util.*;
public class TerminalHard extends Terminal {
    Scanner sc= new Scanner(System.in);
    
    int impostorNum;
    int crewNum;
    int tasksNum;
    
    TerminalHard (int impostorNum, int crewNum, int tasksNum){
        this.impostorNum = impostorNum;
        this.crewNum = crewNum;
        this.tasksNum = tasksNum;
    }
    
    public void greet(Player p){
        System.out.println('\n');    
        System.out.println("Hi " + p.name + "! Welcome aboard.");
    }
    public void showDesc(){
        System.out.println("\"Your task is to find " +impostorNum + " impostors among the crewmembers aboard\"\n" +
        "You will have the opportunity to guess if you answer/finish a task successfully.\"\n" +
        "Be careful because the impostor is also going to hunt a person every round \"\n" +
        " If you are lucky, you can surely select who is/are the impostor(s). Goodluck \"\n");        
        }
    
       public void actionBar(Tasks ta){
        System.out.println("[1] Show Crewmember Lists: ");
        System.out.println("[2] Do a task");
        System.out.println("[3] Task Manager");
    }
}
