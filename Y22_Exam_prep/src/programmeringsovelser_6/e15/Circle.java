package programmeringsovelser_6.e15;

public class Circle implements Shape {
  private double radius;
  
  public Circle(double radius) {
    setRadius(radius);
  }
  
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  public double getRadius() {
    return radius;
  }
  
  @Override
  public String toString() {
    return String.format("[circle] (area: %2.2f)", getArea());
  }
}
