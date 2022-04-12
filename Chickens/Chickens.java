/**
 * Chickens
 */
public class Chickens {

  public static void main(String[] args) {
    int Monday, Tuesday, Wednesday, totalEggs, chickenCount, eggsPerChicken;

    //1st sceneario
    chickenCount  = 3;
    eggsPerChicken = 5;

    Monday = chickenCount * eggsPerChicken;
    Tuesday = chickenCount++ * eggsPerChicken;
    Wednesday = (Monday + Tuesday) / 2;
    totalEggs = Monday + Tuesday + Wednesday;

    System.out.println("eggCount = " + totalEggs);

    //2nd sceneario
    chickenCount  = 8;
    eggsPerChicken = 4;
    
    Monday = chickenCount * eggsPerChicken;
    Tuesday = chickenCount++ * eggsPerChicken;
    Wednesday = (Monday + Tuesday) / 2;
    totalEggs = Monday + Tuesday + Wednesday;
    
    System.out.println("eggCount = " + totalEggs);
    
  }
}