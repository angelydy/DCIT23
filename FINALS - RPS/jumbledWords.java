import java.lang.reflect.Constructor;
import java.util.Scanner;

public class jumbledWords {

  public jumbledWords() {
    String word = "";
    String[] words = {"apple", "banana", "orange", "coconut", "strawberry", "raspberry", "blueberry", "blackberry", "cherry", "grape", "kiwi", "mango", "papaya", "pineapple", "watermelon"};
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
    } else {
      System.out.println("\n||--------------------------------------------||");
      System.out.println("Sorry, that's not it. The word is " + word + ".");
    }
  }
}
