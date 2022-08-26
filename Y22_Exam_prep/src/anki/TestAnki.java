package anki;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class TestAnki {
  public void run() {
    ArrayList<Compare> compares = new ArrayList<>();
    compares.add(new Compare(1));
    compares.add(new Compare(3));
    compares.add(new Compare(2));
    compares.add(new Compare(4));
    NumComparator numComparator = new NumComparator();
  
  
  }
  
  public static void main(String[] args) {
    new TestAnki().run();
  }
}
