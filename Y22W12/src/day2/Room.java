package day2;

public class Room {
  private String roomNumber;
  private int    maxNumberPeople;
  
  Room(String RoomNumber, int maxNumberPeople) {
    setRoomNumber(RoomNumber);
    setMaxNumberPeople(maxNumberPeople);
  }
  
  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }
  
  public String getRoomNumber() {
    return roomNumber;
  }
  
  public void setMaxNumberPeople(int maxNumberPeople) {
    this.maxNumberPeople = maxNumberPeople;
  }
  
  public int getMaxNumberPeople() {
    return maxNumberPeople;
  }
  
  @Override
  public String toString() {
    return String.format("""
                         roomNumber: %s
                         maxNumberPeople: %s""",
        roomNumber,
        maxNumberPeople);
  }
}
