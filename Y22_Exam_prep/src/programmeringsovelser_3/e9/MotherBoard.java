package programmeringsovelser_3.e9;

public class MotherBoard {
  private SataDrive[] sataDrives;
  
  public MotherBoard() {
    sataDrives = new SataDrive[4];
  }
  
  public void addSataDrive(SataDrive sataDrive) {
    // only allow unique
    for (SataDrive s : sataDrives) {
      if (sataDrive.equals(s)) return;
    }
    
    // fill empty
    for (int i = 0; i < sataDrives.length; i++) {
      if (sataDrives[i] == null) {
        sataDrives[i] = sataDrive;
        return;
      }
    }
    
    // board full
    throw new BoardFullException("board is already filled with sata-drives");
  }
  
  public SataDrive[] getSataDrives() {
    return sataDrives;
  }
}
