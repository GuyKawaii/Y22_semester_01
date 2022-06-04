package programmeringsovelser_6.e16;

import java.util.Random;

public class ExamQuestion {
  private int number;
  private Grade grade;
  private static final Random random = new Random();
  
  public ExamQuestion(int number) {
    setNumber(number);
    setGrade();
  }
  
  
  // default getter setter
  public void setNumber(int number) {
    this.number = number;
  }
  
  public int getNumber() {
    return number;
  }
  
  public void setGrade() {
    int gradeValue = random.nextInt(6);
    
    switch (gradeValue) {
      case 0 -> grade = Grade.A;
      case 1 -> grade = Grade.B;
      case 2 -> grade = Grade.C;
      case 3 -> grade = Grade.D;
      case 4 -> grade = Grade.E;
      case 5 -> grade = Grade.F;
      default -> {
        throw new IllegalGradeValue(String.format("Grade value %s ouside of range", gradeValue));
      }
    }
  }
  
  public Grade getGrade() {
    return grade;
  }
  
  @Override
  public String toString() {
    return String.format("number:%2d grade:%s", number, grade.toString());
  }
}
