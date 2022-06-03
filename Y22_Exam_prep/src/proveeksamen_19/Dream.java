package proveeksamen_19;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dream implements Comparable<Dream> {
  private LocalDate localDate;
  private int duration;
  private DreamType dreamType;
  
  public Dream(LocalDate localDate, int duration, DreamType dreamType) {
    setLocalDate(localDate);
    setDuration(duration);
    setDreamType(dreamType);
  }
  
  public boolean isPleasant() {
    if (dreamType == DreamType.NIGHTMARE) return false;
    else if (dreamType == DreamType.WET) {
      return duration < 10;
    } else if (dreamType == DreamType.DRY) {
      return duration > 10;
    }
    return false;
  }
  
  @Override
  public int compareTo(Dream other) {
    return this.localDate.compareTo(other.localDate);
  }
  
  // getter setter
  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }
  
  public void setDuration(int duration) {
    this.duration = duration;
  }
  
  public void setDreamType(DreamType dreamType) {
    this.dreamType = dreamType;
  }
  
  @Override
  public String toString() {
    return String.format("(date: %s, type: %s, duration %s)",
        localDate,
        dreamType.toString(),
        duration);
  }
}
