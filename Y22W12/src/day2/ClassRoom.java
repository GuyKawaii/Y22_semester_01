package day2;

public class ClassRoom extends Room {
  private String wallColor;
  private double sizeBlackboard;
  
  ClassRoom(String roomNumber, int maxNumberPeople, String wallColor, double sizeBlackboard) {
    super(roomNumber, maxNumberPeople);
    
    setWallColor(wallColor);
    setSizeBlackboard(sizeBlackboard);
  }
  
  public void setSizeBlackboard(double sizeBlackboard) {
    this.sizeBlackboard = sizeBlackboard;
  }
  
  public String getWallColor() {
    return wallColor;
  }
  
  public void setWallColor(String wallColor) {
    this.wallColor = wallColor;
  }
  
  public double getSizeBlackboard() {
    return sizeBlackboard;
  }
  
  @Override
  public String toString() {
    return String.format("""
                         %s
                         roomNumber: %s
                         maxNumberPeople: %s
                         """,
        super.toString(),
        wallColor,
        sizeBlackboard);
  }
  
}
