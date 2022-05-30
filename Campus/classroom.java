public class classroom extends campus{
 String building;
 String[] subjects = {"Algorithm", "Computer Programming 2", "CVSU Orientation", "Data Structures & Algo", "Advance Database"};
 int c;

 public void classroomDetails(int c, String building, int subject) {
   this.building = building;
   this.subjects[c] = subjects[subject];
   this.c = c;

   super.campusDetails();
   System.out.println("Building: " + building);
   System.out.println("Room: " + c);
   System.out.println("Subject Taught: " + subjects[subject]);
 }
}