package loanItem;

import java.util.Scanner;

public class Shop {
  public void go() {
    Scanner in = new Scanner(System.in);
    LoanItem[] loanItems;
    String itemTitle;
    char itemType;
    int numItems;
    
    // Add LoanItems
    System.out.print("How many items do you want to register: ");
    numItems = Integer.parseInt(in.nextLine());
    loanItems = new LoanItem[numItems];
    
    for (int i = 0; i < numItems; i++) {
      System.out.printf("""
          
          ITEM no. %S
           - Type (b or v):\040""", (i + 1));
      itemType = in.nextLine().charAt(0);
      
      System.out.print(" - Title: ");
      itemTitle = in.nextLine();
      
      switch (itemType) {
        case 'v' -> loanItems[i] = (new Video(itemTitle));
        case 'b' -> loanItems[i] = (new Book(itemTitle));
      }
    }
    
    
    // Print LoanItems
    
    // Print Header
    System.out.printf("""
        
        LIST OF LOAN ITEMS:
        ---
        ID   %-5S   TITLE
        """, "TYPE");
    
    // Print Items
    for (int i = 0; i < loanItems.length; i++) {
      LoanItem loanItem = loanItems[i];
      System.out.printf("%-2s   %-5s   %s\n",
          (i + 1),
          loanItem.getClass().getSimpleName(),
          loanItem.getTitle());
    }
  }
  
  public static void main(String[] args) {
    new Shop().go();
  }
}
