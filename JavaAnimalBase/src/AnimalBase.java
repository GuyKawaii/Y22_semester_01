import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AnimalBase {
  
  private ArrayList<Animal> animals;
  
  public AnimalBase() {
    animals = new ArrayList<>();
  }
  
  public void start() {
    UserInterface ui = new UserInterface(this);
    ui.start();
  }
  
  public static void main(String[] args) {
    AnimalBase app = new AnimalBase();
    app.start();
  }
  
  public Iterable<Animal> getAllAnimals() {
    return animals;
  }
  
  public int getAnimalCount() {
    return animals.size();
  }
  
  public void sortBy(String sortBy, SortDirection sortDirection) {
    // TODO: Implement sorting!
    System.out.println("TODO: Sort the list of animals by: " + sortBy);
  }
  
  public void createNewAnimal(String name, String description, String type, int age, double weight) {
    Animal animal = new Animal(name, description, type, age, weight);
    animals.add(animal);
  }
  
  public boolean deleteAnimal(String name) {
    // find animal with this name
    Animal animal = findAnimalByName(name);
    if (animal == null) {
      return false;
    } else {
      animals.remove(animal);
      return true;
    }
  }
  
  private Animal findAnimalByName(String name) {
    for (Animal animal : animals) {
      if (animal.getName().equalsIgnoreCase(name)) {
        return animal;
      }
    }
    return null;
  }
  
  
  public boolean loadDatabase() {
    try {
      Scanner fileScanner = new Scanner(new File("animals.csv"));
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        Scanner token = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
        String name = token.next();
        String desc = token.next();
        String type = token.next();
        int age = token.nextInt();
        double weight = token.nextDouble();
        
        // Create animal(String name, String desc, String type, int age, double weight)
        animals.add(new Animal(name, desc, type, age, weight));
      }
      return true;
      
    } catch (FileNotFoundException e) {
      System.err.println(e);
      return false;
    }
  }
  
  public boolean saveDatabase() {
    // overwrite old database-file
    try {
      PrintStream file = new PrintStream("animals.csv");
      
      for (Animal animal : animals) {
        file.printf("%s;%s;%s;%s;%s\n",
            animal.getName(),
            animal.getDesc(),
            animal.getType(),
            animal.getAge(),
            animal.getWeight());
      }
      
      // release file
      file.close();
      return true;
      
    } catch (FileNotFoundException e) {
      System.err.println(e);
      return false;
    }
    
    
  }
  
}
