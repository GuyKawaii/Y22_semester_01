public class DayTest {
  
  boolean isMonday(Day day) {
    if (day == Day.MONDAY) return true;
    else return false;
  }
  
  boolean isWeekend(Day day) {
    switch (day) {
      case SATURDAY, SUNDAY -> {
        return true;
      }
      
      default -> { // other days
        return false;
      }
    }
  }
  
  void AllDays() {
    Day[] days = Day.values();
    
    for (Day d : days) {
      System.out.println(d.toString());
    }
    
    
    
  }
  
  public static void main(String[] args) {
    new DayTest().AllDays();
    boolean isMonday = new DayTest().isMonday(Day.THURSDAY);
    System.out.println(isMonday);
  }
}
