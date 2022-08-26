package programmeringsovelser_3.e9;

public class SataDrive {
  private final char driveLetter;
  
  public SataDrive(char driveLetter) {
    this.driveLetter = driveLetter;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof SataDrive other) return this.driveLetter == other.driveLetter;
    
    else return false;
  }
  
  @Override
  public String toString() {
    return String.valueOf(driveLetter);
  }
}
