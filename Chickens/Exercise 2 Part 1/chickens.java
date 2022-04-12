import java.util.Scanner;

/**
 * chickens
 */
public class chickens {

  public static void main(String[] args) {
    //FIRST EXERCISE
    int Monday = 100, Tuesday = 121, Wednesday = 117;
    double dailyAverage, monthlyAverage, monthlyProfit;

    dailyAverage = (Monday + Tuesday + Wednesday) / 3;
    monthlyAverage = dailyAverage * 30;
    monthlyProfit = monthlyAverage * 0.18;

    System.out.println("The daily average is $" + dailyAverage);
    System.out.println("The monthly average is $" + monthlyAverage);
    System.out.println("The monthly profit is $" + monthlyProfit);

    //Write a code that will exchange the value of x and y using a 
    //mathematical operation, if x = (user input), y = (user input), z = 0
    int x, y, z = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number for x");
    x = scan.nextInt();
    System.out.println("Enter a number for y");
    y = scan.nextInt();
    z = y - x;
    x = z + x;
    y = x - z;
    System.out.println("The value of x is " + x);
    System.out.println("The value of y is " + y);

    //Write a program that processes a first, 
    //middle and last name (read an entire line as a single string) 
    //entered by the user. Then prints the first and last name in reverse followed by a comma and the middle initial. 

    String firstName, middleName, lastName, fullName;
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter your first name");
    firstName = scan2.nextLine();
    System.out.println("Enter your middle name");
    middleName = scan2.nextLine();
    System.out.println("Enter your last name");
    lastName = scan2.nextLine();
    fullName = lastName + ", " + firstName + " " + middleName.charAt(0);
    System.out.println(fullName);

    //SMILEY FACE
    System.out.println("  ####  ");
    System.out.println(" #    # ");
    System.out.println("# #  # #");
    System.out.println("#      #");
    System.out.println("# #  # #");
    System.out.println("#  ##  #");
    System.out.println(" #    # ");
    System.out.println("  ####  ");
  }
}