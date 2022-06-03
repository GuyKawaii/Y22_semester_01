package extra;


public class Rabbit extends Animal implements Hostable {
  
  public Rabbit(String name) {
    super(name);
  }
  
  @Override
  public boolean currentlyHosted() {
    return false;
  }
}
