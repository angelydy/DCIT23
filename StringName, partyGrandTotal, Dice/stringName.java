import java.util.regex.Pattern;

public class stringName {
  //You must implement the following:
  public void splitName(String a) {
    if (Pattern.matches("^[ A-Za-z]+$", a)) {
      String[] nameArray = a.split(" ");
      String lastName = nameArray[nameArray.length - 1];
      String firstInitial = nameArray[0].substring(0, 1);
      System.out.println(lastName + ", " + firstInitial);
      System.out.println("No. of Char: " + nameArray[0].length());
    }
    else {
      System.out.println("Please enter a valid name");
    }
  }
}
