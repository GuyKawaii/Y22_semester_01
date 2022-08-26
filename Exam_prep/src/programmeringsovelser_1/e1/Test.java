package programmeringsovelser_1.e1;

public class Test {
  
  public void run() {
    Text text = new Text();
    
    text.addLine("A");
    text.addLine("A");
    text.addLine("A");
    text.addLine("B");
    text.addLine("C");
    text.addLine("D");
    text.addLine("D");
  
  
    System.out.println(text.numberOfUniqueLines());
    
    
    
  }
  
  public static void main(String[] args) {
    new Test().run();
  }
}
