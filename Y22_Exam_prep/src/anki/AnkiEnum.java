package anki;

public enum AnkiEnum {
  A(1),
  B(2),
  c(3);
  
  private final int value;
  
  AnkiEnum(int value){
    this.value = value;
  }
  
  public  int getValue(){
    return value;
  }
}
