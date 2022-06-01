import javax.print.DocFlavor.STRING;

public abstract class driver {
  int plateNumber;
  String driversName, licenseNum;

  public abstract void displayInfo(int plateNumber, String origin, String destination, int fare);

  public void getDriverInfo(int plateNumber, String driversName, String licenseNum){
    this.plateNumber = plateNumber;
    this.driversName = driversName;
    this.licenseNum = licenseNum;

    System.out.println("\nDriver's Name: " + driversName);
    System.out.println("Driver's License Number: " + licenseNum);
    System.out.println("Bus' Plate Number: " + plateNumber);
  }
}
