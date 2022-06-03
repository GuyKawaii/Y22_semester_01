package day5;

import java.util.ArrayList;

public class NameList {
  private ArrayList<String> names;
  
  public NameList() {
    names = new ArrayList<>();
  }
  
  public void addName(String name) {
    names.add(name);
  }
  
  public boolean containName(String name) {
    for (String n : names) {
      if (n == name) return true;
    }
    
    return false;
  }
}
