package loanItem;

public abstract class LoanItem {
  private String title;
  
  LoanItem(String title) {
    this.title = title;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
}
