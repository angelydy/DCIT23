public class teacher extends student {
  String[] professors = {"Sir Paul", "Ma'am Ezra", "Ma'am Julie", "Sir Russel", "Sir Neru"};
  String[] subjects = {"Algorithm", "Computer Programming 2", "CVSU Orientation", "Data Structures & Algo", "Advance Database"};

  public void teacherDetails(int p) {
    System.out.println("\nProfessor Name: " + professors[p]);
    System.out.println("Subject Taught: " + subjects[p]);
    
    super.studentDetails(202105866, "Dy, Angely Mae R.", subjects[p]);
  }
}
