package programmeringsovelser_6.e15;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class TestShapes {
  
  public void run() {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add((Shape) new Square(5));
    shapes.add((Shape) new Circle(5));
    shapes.add((Shape) new Square(2));
    shapes.add((Shape) new Circle(2));
    shapes.add((Shape) new Square(3));
    shapes.add((Shape) new Circle(3));
    
    for (Shape shape : shapes) {
      System.out.println(shape);
    }
    
  }
  
  public static void main(String[] args) {
    new TestShapes().run();
  }
}
