package programmeringsovelser_6.e15;

public class Square implements Shape {
  private double width;
  
  public Square(double width) {
    setWidth(width);
  }
  
  @Override
  public double getArea() {
    return width * width;
  }
  
  public void setWidth(double width) {
    this.width = width;
  }
  
  public double getWidth() {
    return width;
  }
  
  @Override
  public String toString() {
    return String.format("[square] (area: %2.2f)", getArea());
  }
}
