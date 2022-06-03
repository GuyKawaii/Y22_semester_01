package day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameListTest {
  NameList nameList;
  
  @BeforeEach
  public void setup() {
    nameList = new NameList();
  }
  
  @Test
  public void addName() {
    nameList.addName("Daniel");
    
    assertEquals(true, nameList.containName("Daniel"));
  }
  
}