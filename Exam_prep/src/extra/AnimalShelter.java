package extra;

import java.util.ArrayList;

public class AnimalShelter {
  private ArrayList<Hostable> hostables;
  
  public AnimalShelter() {
    hostables = new ArrayList<>();
  }
  
  public void addHostableAnimal(Hostable hostable) {
    hostables.add(hostable);
  }
}
