package programmeringsovelser_5.e1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestHogwartsStudent {
  
  public void run() {
    HogwartsStudent[] students = new HogwartsStudent[4];
    HogwartsStudent s1 = new HogwartsStudent("a first", "a last", House.GRYFFINDOR);
    HogwartsStudent s2 = new HogwartsStudent("b first", "b last", House.GRYFFINDOR);
    HogwartsStudent s3 = new HogwartsStudent("c first", "c last", House.GRYFFINDOR);
    HogwartsStudent s4 = new HogwartsStudent("d first", "d last", House.GRYFFINDOR);
    students[0] = s4;
    students[1] = s2;
    students[2] = s3;
    students[3] = s1;
    
    System.out.println("### not sorted ###");
    System.out.println(Arrays.toString(students));
    
    Arrays.sort(students);
    
    System.out.println("### sorted ###");
    System.out.println(Arrays.toString(students));
    
    // write students
//    writeStudent(students);
    
    // read students
    System.out.println("### read students ###");
    System.out.println(Arrays.toString(readStudentFile()));
  }
  
  public void writeStudent(HogwartsStudent[] students) {
    File file = new File("files\\student.txt");
    
    try {
      PrintStream fileOut = new PrintStream(new FileOutputStream(file, false));
      for (HogwartsStudent student : students) {
        fileOut.printf("%s;%s;%s\n", student.getFirstName(), student.getLastName(), student.getHouse());
      }
      fileOut.close();
      
    } catch (FileNotFoundException e) {
      System.err.println(e);
    }
    
  }
  
  public HogwartsStudent[] readStudentFile() {
    ArrayList<HogwartsStudent> students = new ArrayList<>();
    File file = new File("files\\student.txt");
    
    try {
      Scanner fileScanner = new Scanner(file);
      
      while (fileScanner.hasNextLine()) {
        Scanner lineScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
        String firstName = lineScanner.next();
        String lastName = lineScanner.next();
        House house = House.valueOf(lineScanner.next());
        
        students.add(new HogwartsStudent(firstName, lastName, house));
      }
      
    } catch (Exception e) {
      System.err.println(e);
    }
    
    return students.toArray(new HogwartsStudent[students.size() - 1]);
  }
  
  public static void main(String[] args) {
    new TestHogwartsStudent().run();
  }
}
