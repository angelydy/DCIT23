import java.util.Scanner;

public class isoscelesRectangle {

  public static void rectangle(int width, int height) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (i == 0 || i == height - 1) {
          System.out.print("#");
        } else {
          if (j == 0 || j == width - 1) {
            System.out.print("#");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  public static void rightTriangle(int height) {
    for(int i = 0;i <= height; i++) {
      if(i == 0 || i == height) 
        for(int j = 1;j <= i; j++) {
          System.out.print("*");
        }
      else {
        for (int j = 1; j <= i; j++) {
          if (j == 1 || j == i) 
            System.out.print("*");
          else 
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  


  public static void main(String[] args) {
    //call 2 methods, one for rectangle and one for triangle

    int width, height;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the width of the rectangle: ");
    width = input.nextInt();
    System.out.println("Enter the height of the rectangle: ");
    height = input.nextInt();
    rectangle(width, height);

    System.out.println("Enter the height of the isosceles triangle: ");
    height = input.nextInt();
    rightTriangle(height);
  }
}
