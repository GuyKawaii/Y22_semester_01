package programmeringsovelser_2.e4;

import java.security.Key;
import java.util.ArrayList;

public class Keyword {
  private String word;
  private String definition;
  private ArrayList<Keyword> seeAlso;
  
  
  public Keyword(String word, String definition) {
    setWord(word);
    setDefinition(definition);
    seeAlso = null;
  }
  
  public void addSeeAlso(Keyword keyword) {
    if (!seeAlso.contains(keyword)) seeAlso.add(keyword);
  }
  
  public ArrayList<Keyword> seeAlso() {
    return seeAlso;
  }
  
  public boolean matches(String searchWord) {
    boolean match;
    
    match = searchWord.contains(word);
    if (match) return true;
    match = word.contains(searchWord);
    if (match) return true;
    
    return false;
  }
  
  
  // getter setter
  public void setWord(String word) {
    this.word = word;
  }
  
  public String getWord() {
    return word;
  }
  
  public void setDefinition(String definition) {
    this.definition = definition;
  }
  
  public String getDefinition() {
    return definition;
  }
}
