package extra;

public class Dog extends Animal implements  Hostable{
  
  public Dog(String name) {
    super(name);
  }
  
  @Override
  public boolean currentlyHosted() {
    return true;
  }
}
