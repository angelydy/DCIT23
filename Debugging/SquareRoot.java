import java.util.Scanner;

public class SquareRoot {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a non-negative integer: ");
	    int number = console.nextInt();
        while (number < 0) {
            System.out.print("Invalid number, try again: ");
            number = console.nextInt();
        }
        if (number > 0) {
            System.out.printf("The square root of %d is %.4f\n", number, Math.sqrt(number));
        }
    }
}