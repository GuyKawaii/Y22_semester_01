package desert_island;

import java.util.Scanner;

public class UserInterface {
  Scanner in = new Scanner(System.in);
  
  public static void main(String[] args) {
    new UserInterface().run();
  }
  
  public void run() {
    // setup
    String[] items = {"kæreste", "kaffemaskine", "Netflix", "sofa", "løbesko",
        "guitar", "slik", "hund", "bog", "øl"};
    PreferredItem preferredItem = new PreferredItem(items);
    
    // main loop
    while (true) {
      printItems(preferredItem.getItemNames());
      System.out.print(" 0 -> EXIT or choose item: ");
      Integer userInput = parseInteger(preferredItem.getItemNames().length);
  
      if (userInput != null) preferredItem.addCount(userInput);
      else {
        System.err.println("wrong input selection - try again\n");
        continue;
      }
      
      System.out.println(preferredItem);
      
      if (userInput == 0) break;
    }
    
  }
  
  public void printItems(String[] items) {
    for (int i = 0; i < items.length - 1; i++) {
      System.out.printf("%2s. %s%n", (i + 1), items[i]);
    }
  }
  
  public Integer parseInteger(int maxInteger) {
    try {
      int select = Integer.parseInt(in.nextLine());
  
      if (0 <= select && select <= maxInteger) return select;
      else return null;
      
    } catch (Exception e) {
      return null;
    }
  }
  
}
