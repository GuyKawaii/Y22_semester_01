package day2;

public class School {
  public void go() {
    TeacherRoom t1 = new TeacherRoom("2.2", 42, "SoySwitch", "Coffee machine");
    ClassRoom c1 = new ClassRoom("2.2", 42, "gray", 2.5);
    Room r1 = new Room("2.2", 42);
    
    // Print instances of rooms
    System.out.printf("%s:\n%s\n", t1.getClass().getSimpleName(), t1);
    System.out.printf("%s:\n%s\n", c1.getClass().getSimpleName(), c1);
    System.out.printf("%s:\n%s\n", r1.getClass().getSimpleName(), r1);
  }
  
  public static void main(String[] args) {
//    new School().go();
    School s = new School();
    s.go();
  }
}
