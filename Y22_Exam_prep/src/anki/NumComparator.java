package anki;

import java.util.Comparator;

public class NumComparator implements Comparator<Compare> {
  
  @Override
  public int compare(Compare o1, Compare o2) {
    return o1.getNum() - o2.getNum();
  }
}
