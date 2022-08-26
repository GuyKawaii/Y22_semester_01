package pizzabar;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
  ArrayList<Pizza> pizzas;
  ArrayList<Topping> toppings;
  
  public Menu() {
    pizzas = new ArrayList<>();
    toppings = new ArrayList<>();
  }
  
  public Menu(String pizzaCSV, String toppingCSV) {
    pizzas = new ArrayList<>();
    toppings = new ArrayList<>();
    
    loadPizzaMenu(pizzaCSV);
    loadToppingMenu(toppingCSV);
  }
  
  
  
  // Pizzas
  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }
  
  public Pizza getPizza(String pizzaName) {
    // return copy of pizza
    for (Pizza menuPizza : pizzas)
      if (menuPizza.getName().equalsIgnoreCase(pizzaName))
        return new Pizza(menuPizza.getName(), menuPizza.getDescription(), menuPizza.getPrice());
    
    return null;
  }
  
  public Pizza getPizza(int pizzaID) {
    // return copy of pizza
    int index = pizzaID - 1;
    
    // Uses ID not index i.e. first ID = 1
    if (0 <= index && index < pizzas.size()) {
      Pizza menuPizza = pizzas.get(index);
      return new Pizza(menuPizza.getName(), menuPizza.getDescription(), menuPizza.getPrice());
    }
    return null;
  }
  
  public ArrayList<Pizza> getPizzas() {
    return pizzas;
  }
  
  // Toppings
  public void addTopping(Topping topping) {
    toppings.add(topping);
  }
  
  public Topping getTopping(String toppingName) {
    for (Topping topping : toppings)
      if (topping.getName().equalsIgnoreCase(toppingName)) return topping;
    
    return null;
  }
  
  public Topping getTopping(int toppingID) {
    int index = toppingID - 1;
    
    // Uses ID not index i.e. first ID = 1
    if (0 <= index && index < toppings.size())
      return toppings.get(index);
    
    return null;
  }
  
  public ArrayList<Topping> getToppings() {
    return toppings;
  }
  
  public boolean loadPizzaMenu(String fileCSV) {
    try {
      Scanner fileScanner = new Scanner(new File(fileCSV));
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        Scanner token = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
        String name = token.next();
        String desc = token.next();
        int price = token.nextInt();
        
        pizzas.add(new Pizza(name, desc, price));
      }
      return true;
      
    } catch (Exception e) {
      System.err.println(e);
      return false;
    }
  }
  
  public boolean loadToppingMenu(String fileCSV) {
    try {
      Scanner fileScanner = new Scanner(new File(fileCSV));
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        Scanner token = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
        String name = token.next();
        int price = token.nextInt();
        
        toppings.add(new Topping(name, price));
      }
      return true;
      
    } catch (Exception e) {
      System.err.println(e);
      return false;
    }
  }
  
  
  
}
