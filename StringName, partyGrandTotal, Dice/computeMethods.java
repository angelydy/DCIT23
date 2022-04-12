import java.util.Random;
public class computeMethods {
  //Computes the hypotenuse length of a triangle given its side length  
  //Simulate the rolling of three 6-sided dice. Get the sum of first and 
  //second dice and the third one will be the multiplier. Display the result.

  public void hypotenuse (int a, int b) {
    double c = Math.sqrt(a*a + b*b);
    System.out.println("The hypotenuse length of the triangle is: " + c);
  }

  public void roll() {
    Random rand = new Random();
    int a = rand.nextInt(6) + 1;
    int b = rand.nextInt(6) + 1;
    int multiplier = rand.nextInt(6) + 1;
    int c = a + b;
    int e = multiplier * c;
    System.out.println("\nDice 1: " + a);
    System.out.println("Dice 2: " + b);
    System.out.println("Multiplier: " + multiplier);
    System.out.println("The result is: " + e);
  }
}
