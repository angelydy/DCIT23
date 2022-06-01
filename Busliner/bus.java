public class bus extends driver{
  int plateNumber, fare, balance;
  String destination, origin;

  public void fareCalculator(int acc, int balance, int fare){
    this.fare = fare;
    this.balance = balance - fare;

    if(balance < fare){
      System.out.println("\nInsufficient Payment");
      System.out.println("Balance: (" + balance + " Insufficient Amount)");
      System.out.println("------------------------------------\n");
    }
    else{
      System.out.println("\nAccount: " + acc);
      System.out.println("Fare: " + fare);
      System.out.println("Balance: " + this.balance);
      System.out.println("------------------------------------\n");
    }
  }

  public void displayInfo(int plateNumber, String origin, String destination, int fare) {
    this.plateNumber = plateNumber;
    this.origin = origin;
    this.destination = destination;
    this.fare = fare;

    System.out.println("\n------------------------------------");
    System.out.println("Bus' Plate Number: " + plateNumber);
    System.out.println("Origin: " + origin);
    System.out.println("Destination: " + destination);
    System.out.println("Basic Fare: " + fare);

    super.getDriverInfo(9017363, "Joseph Magno", "D289930");
  }
}
