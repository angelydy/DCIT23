public class testClass {
  public static void main(String[] args) {
    classroom c = new classroom();
    teacher t = new teacher();
    
    int c1 = 1;
    int c2 = 3;

    System.out.println("-------------------------------------------------");
    c.classroomDetails(c1, "DIT", c1);
    t.teacherDetails(c1);
    c.classroomDetails(c2, "DIT", c2);
    t.teacherDetails(c2);
  }
}
