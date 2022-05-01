package desert_island;

import java.util.Arrays;

public class PreferredItem {
  private String[] itemNames;
  private int[] itemNumbers;
  
  
  public PreferredItem(String[] items) {
    itemNames = items.clone();
    itemNumbers = new int[items.length];
  }
  
  public String[] getItemNames() {
    return itemNames;
  }
  
  public int[] getItemNumbers() {
    return itemNumbers;
  }
  
  public boolean addCount(int itemNumber) {
    int index = itemNumber - 1;
    
    if (0 <= index && index <= itemNames.length) {
      itemNumbers[index]++;
      return true;
      
    } else return false;
  }
  
  public boolean addCount(String itemName) {
    for (int i = 0; i < itemNames.length; i++) {
      if (itemName.equalsIgnoreCase(itemNames[i])) {
        itemNumbers[i]++;
        return true;
      }
    }
    
    return false;
  }
  
  
  @Override
  public String toString() {
    StringBuilder returnStr = new StringBuilder();
    
    for (int i = 0; i < itemNames.length - 1; i++)
      returnStr.append(String.format("%2s: %s\n", itemNumbers[i], itemNames[i]));
    
    return returnStr.toString();
  }
}
