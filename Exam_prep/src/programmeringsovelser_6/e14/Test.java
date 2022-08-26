package programmeringsovelser_6.e14;

public class Test {
  public static void main(String[] args){
    new Test().run();
  }
  
  void run(){
    Image image = new Image("abcjjpg", 10, 10);
    System.out.println(image.isKnownFileType());
  }
}
