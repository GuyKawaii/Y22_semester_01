package day5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
  Dice dice;
  
  @BeforeEach
  public void setup() {
    dice = new Dice();
  }
  
  @Test
  public void roll() {
    int roll;
  
    // probabilistic test
    for (int i = 0; i < 1000; i++) {
      roll = dice.roll();
      
      assertTrue(1 <= roll && roll <= 6);
    }
    
  }
}