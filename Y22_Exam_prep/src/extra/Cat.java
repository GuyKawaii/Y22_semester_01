package extra;

public class Cat extends Animal implements Hostable {
  
  public Cat(String name) {
    super(name);
  }
  
  @Override
  public boolean currentlyHosted() {
    return true;
  }
}
