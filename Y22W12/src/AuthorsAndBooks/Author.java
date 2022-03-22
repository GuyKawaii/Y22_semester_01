package AuthorsAndBooks;

import java.util.ArrayList;

public class Author {
  private String name;
  private char gender;
  private String email;
  private ArrayList<Book> books;
  
  Author(String name, char gender, String email) {
    this.name = name;
    this.gender = gender;
    setEmail(email);
    books = new ArrayList<>();
  }
  
  private void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  private void setGender(char gender) {
    this.gender = gender;
  }
  
  public char getGender() {
    return gender;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void addBook(Book book) {
    books.add(book);
  }
  
  @Override
  public String toString() {
    StringBuilder returnStr = new StringBuilder();
    
    // Add header
    returnStr.append(String.format("%-25s   gender: %s   email: %s\n",
        getName(),
        getGender(),
        getEmail()));
    
    // Add books
    for (Book book : books) {
      returnStr.append(String.format(" - %-43s %sp\n",
          book.getTitle(),
          book.getPageNumber()));
    }
    
    return returnStr.toString();
  }
}
