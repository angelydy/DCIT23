public class student {
  String studName, subject;
  int s;

  public void studentDetails(int s, String studName, String subject) {
    this.studName = studName;
    this.subject = subject;
    this.s = s;

    System.out.println("\nStudent No: " + s);
    System.out.println("Student Name: " + studName);
    System.out.println("Subject Taught: " + subject);
    System.out.println("\n-------------------------------------------------");
  }
}
