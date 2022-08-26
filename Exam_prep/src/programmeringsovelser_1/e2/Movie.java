package programmeringsovelser_1.e2;

import java.time.LocalDate;

public class Movie {
  private String title;
  private int releaseYear;
  private Producer producer;
  
  public Movie(String title, int releaseYear) {
    setTitle(title);
    setReleaseYear(releaseYear);
  }
  
  public Movie(String title) {
    setTitle(title);
    setReleaseYear(LocalDate.now().getYear());
  }
  
  public  void addProducer(Producer producer) {
    this.producer = producer;
  }
  
  // setter getter area
  public void setTitle(String title) {
    this.title = title;
  }
  
  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
}
