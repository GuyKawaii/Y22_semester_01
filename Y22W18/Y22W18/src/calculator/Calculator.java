package calculator;


import java.util.Scanner;

public class Calculator {
//  Scanner in = new Scanner(System.in);
  
  public int sum(int num1, int num2) {
    if (num1 > 100 || num2 > 100) throw new IllegalArgumentException("above 100 not allowed");
    
    return num1 + num2;
  }
  
  
}
