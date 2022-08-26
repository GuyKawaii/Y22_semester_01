package programmeringsovelser_3.e9;

import java.util.Arrays;

public class TestMotherBoard {
  
  public void run() {
   SataDrive s1 = new SataDrive('C');
   SataDrive s1_duplicate = new SataDrive('C');
   
   SataDrive s2 = new SataDrive('D');
   SataDrive s3 = new SataDrive('E');
   SataDrive s4 = new SataDrive('F');
   SataDrive s5 = new SataDrive('G');
   
   MotherBoard motherBoard = new MotherBoard();
   motherBoard.addSataDrive(s1);
   motherBoard.addSataDrive(s1_duplicate);
   motherBoard.addSataDrive(s2);
   motherBoard.addSataDrive(s3);
   motherBoard.addSataDrive(s4);
//   motherBoard.addSataDrive(s5);
  
    System.out.println(Arrays.toString(motherBoard.getSataDrives()));
  }
  
  public static void main(String[] args) {
    new TestMotherBoard().run();
  }
}
