package programmeringsovelser_4.e11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
  private String heading;
  private String body;
  private String Author;
  
  public Article(String heading, String body, String author) {
    setHeading(heading);
    setBody(body);
    setAuthor(author);
  }
  
  public String getLongestWord() {
    String longestWord = "";
    String[] words = body.split(" ");
    
    for (String word : words) {
      if (word.length() > longestWord.length()) longestWord = word;
    }
    
    return longestWord;
  }
  
  public String[] getUniqueWords() {
    String[] words = body.split(" ");
    Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
    String[] unique = new String[uniqueWords.size()];
    
    
    return uniqueWords.toArray(unique);
  }
  
  
  // default getter setter
  public void setHeading(String heading) {
    this.heading = heading;
  }
  
  public String getHeading() {
    return heading;
  }
  
  public void setBody(String body) {
    this.body = body;
  }
  
  public String getBody() {
    return body;
  }
  
  public void setAuthor(String author) {
    Author = author;
  }
  
  public String getAuthor() {
    return Author;
  }
}
