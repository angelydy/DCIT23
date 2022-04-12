/**
 * submitted by: Angely
 */
public class grandTotal {

  //It’s Alex’s birthday! You’ve arranged a group of eight friends to celebrate at a 
  //local restaurant. When your party receives their bill, nobody is quite sure what 
  //they owe. You only know everyone’s total before tax (5%) and tip (15%). But lucky 
  //you! You brought your laptop and are asked to write a program that calculates 
  //everybody’s total.


  public double tax = 0.05;
  public double tip = 0.15;

  public void findTotal(int person1, int person2, int person3, int person4, int person5, int person6, int person7, int person8) {
    double total = person1 + person2 + person3 + person4 + person5 + person7;
    double taxTotal = total * tax;
    double tipTotal = total * tip;
    double grandTotal = (total + taxTotal + tipTotal) / 6;
    System.out.println("The total payment of each person is: $" + grandTotal);
  }

  public static void main(String[] args) {
    grandTotal p = new grandTotal();
    p.findTotal(10, 12, 9, 8, 7, 15, 11, 30);
  }
}