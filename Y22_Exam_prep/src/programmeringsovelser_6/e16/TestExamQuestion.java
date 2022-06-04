package programmeringsovelser_6.e16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class TestExamQuestion {
  public void run() {
    ArrayList<ExamQuestion> questions = new ArrayList<>();
    
    for (int i = 1; i < 15; i++) {
      questions.add(new ExamQuestion(i));
    }
    
    for (ExamQuestion question : questions) {
      System.out.println(question);
    }
    
    writeExamQuestions(questions);
  }
  
  public void writeExamQuestions(ArrayList<ExamQuestion> questions) {
    File file = new File("files\\questions.txt");
  
    try {
      PrintStream fileOut = new PrintStream(file);
      
      for (ExamQuestion question:questions) {
        fileOut.printf("%s;%s\n", question.getNumber(), question.getGrade());
      }
      
      fileOut.close();
      
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    
  }
  
  public static void main(String[] args) {
    new TestExamQuestion().run();
  }
}
