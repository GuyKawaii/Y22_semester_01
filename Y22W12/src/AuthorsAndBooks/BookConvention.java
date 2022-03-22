package AuthorsAndBooks;

import java.util.ArrayList;

public class BookConvention {
  public void go() {
    ArrayList<Author> authors = new ArrayList<>();
    
    Author a1 = new Author("Nassim Nicholas Taleb", 'M', "nnt1@nyu.edu");
    authors.add(a1);
    Book b1 = new Book("Fooled by Randomness", a1, 368);
    Book b2 = new Book("The Black Swan", a1, 366);
    Book b3 = new Book("The Bed of Procrustes", a1, 128);
    Book b4 = new Book("Antifragile", a1, 426);
    Book b5 = new Book("Skin in the Game", a1, 272);
    a1.addBook(b1);
    a1.addBook(b2);
    a1.addBook(b3);
    a1.addBook(b4);
    a1.addBook(b5);
    
    Author a2 = new Author("Weston A. Price", 'M', "NA");
    authors.add(a2);
    Book b6 = new Book("Nutrition and Physical Degeneration", a2, 524);
    a2.addBook(b6);
    
    Author a3 = new Author("Gerald H. Pollack", 'M', "ghp@uw.edu");
    authors.add(a3);
    Book b7 = new Book("The Fourth Phase of Water", a3, 358);
    Book b8 = new Book("Cells, Gels and the Engines of Life", a3, 320);
    a3.addBook(b7);
    a3.addBook(b8);
  
    System.out.println("AUTHORS AND BOOKS:");
    for (Author author : authors) {
      System.out.println(author);
    }
  }
  
  public static void main(String[] args) {
    new BookConvention().go();
  }
}
