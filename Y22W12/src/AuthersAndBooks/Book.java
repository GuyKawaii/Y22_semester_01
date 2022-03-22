package AuthersAndBooks;

public class Book {
  private String title;
  private Author author;
  private int pageNumber;
  
  Book(String title, Author author, int pageNumber) {
    setTitle(title);
    setAuther(author);
    setPageNumber(pageNumber);
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setAuther(Author author) {
    this.author = author;
  }
  
  public Author getAuther() {
    return author;
  }
  
  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }
  
  public int getPageNumber() {
    return pageNumber;
  }
}