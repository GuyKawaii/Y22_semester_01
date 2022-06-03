package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  
  @Test
  public void sum() {
    // Arrange
    Calculator calculator = new Calculator();
    
    try {
      // Act
      int sum = calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE * 2);
      // Assert
      assertEquals(2, sum);
      
    } catch (Exception e) {
    
    }
    
  }
  
  
  @Test
  public void sumLargeNumbers() {
    // Arrange
    Calculator calculator = new Calculator();
    
    // Act
    
    // Assert
    
  }
}