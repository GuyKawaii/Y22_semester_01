package programmeringsovelser_5.e4;

public class CodeMessage {
  private String plainText;
  private int[] ciphers;
  private int shiftValue;
  
  public CodeMessage(String plainText, int shiftValue) {
    setPlainText(plainText);
    setShiftValue(shiftValue);
    encrypt();
  }
  
  public int charValue(char c) {
    if (c == ' ') return 0;
    
    else if ('A' <= c && c <= 'z') return c - 'A' + 1 + shiftValue;
    
    else throw new IllegalEncryptionChar(c + " is not allowed only A-Z and space");
  }
  
  public void encrypt() {
    ciphers = new int[plainText.length()];
    
    char[] chars = plainText.toUpperCase().toCharArray();
    
    for (int i = 0; i < plainText.length(); i++) {
      ciphers[i] = charValue(chars[i]);
    }
  }
  
  // default getter setter
  public void setPlainText(String plainText) {
    this.plainText = plainText;
  }
  
  public String getPlainText() {
    return plainText;
  }
  
  public void setShiftValue(int shiftValue) {
    this.shiftValue = shiftValue;
  }
  
  public int getShiftValue() {
    return shiftValue;
  }
  
  public int[] getCiphers() {
    return ciphers;
  }
}
