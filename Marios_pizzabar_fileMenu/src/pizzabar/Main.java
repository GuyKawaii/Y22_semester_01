package pizzabar;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
  UserInterface ui = new UserInterface();
  Scanner in = new Scanner(System.in);
  OrderList orderList = new OrderList();
  private Menu menu;
  
  public static void main(String[] args) {
    new Main().run();
  }
  
  public boolean mainMenu(boolean loop) {
    ui.printOrderList(orderList, false);
    ui.printMainMenu();
    String userInput = in.nextLine().toLowerCase(Locale.ROOT);
    switch (userInput.toLowerCase(Locale.ROOT)) {
      case "1", "m", "make order", "make" -> makeOrder();
      case "2", "e", "edit order", "edit" -> chooseOrder();
      case "3", "s", "show all orders", "show", "all" -> displayOrderList(true);
      case "4", "x", "exit" -> loop = false;
    }
    return loop;
  }
  
  void makeOrder() {
    boolean loop = true;
    Order order = new Order();
    addPizzaToOrder(order);
    while (loop) {
      
      ui.makeOrderMessage();
      String userInput = in.nextLine().toLowerCase();
      
      switch (userInput) {
        case "add", "a" -> addPizzaToOrder(order);
        case "remove", "r" -> removePizzaFromOrder(order);
        case "" -> { // continue selected
          // only allow orders with items
          if (order.getPizzaTypes().isEmpty()) ui.makeOrderErrorMessage();
          else loop = false;
        }
      }
      
    }
    
    // pickupTime
    LocalDateTime pickupTime = pickupTimeMenu();
    order.setPickupTime(pickupTime);
    
    // Add finished order
    orderList.addOrder(order);
  }
  
  public void addPizzaToOrder(Order order) {
    // adding: customized pizzaType and its quantity to order
    Pizza pizza = null;
    int quantity;
    
    ui.addPizzaToOrderMessage();
    
    // Selecting pizza
    boolean noPizzaSelected = true;
    while (noPizzaSelected) {
      // UserInput
      String userInput = in.nextLine().toLowerCase();
      Integer pizzaID = tryParseInteger(userInput);
      
      // Select pizza by ID or name
      if (pizzaID != null)
        pizza = menu.getPizza(pizzaID);
      else
        pizza = menu.getPizza(userInput);
      
      // retry until pizza selected
      if (pizza != null) noPizzaSelected = false;
      else ui.addPizzaToOrderErrorMessage();
    }
    
    // Add toppings to current pizza
    toppingsMenu(pizza);
    
    // Select quantity of given pizza
    quantity = pizzaQuantityMenu();
    
    // Add selected pizza to order
    order.addPizza(pizza, quantity);
    ui.addPizzaToOrderSuccessMessage(pizza);
    
    ui.printOrder(order, false);
  }
  
  public void toppingsMenu(Pizza pizza) {
    // modifies pizza by adding toppings
    boolean addingToppings = true;
    
    // Until chosen
    while (addingToppings) {
      ui.toppingMenuMessage();
      
      // get action and topping
      String[] userInput = in.nextLine().toLowerCase().split(" ", 2);
      String action = userInput[0];
      String topping = (userInput.length == 2) ? userInput[1] : null;
      
      // preform action
      switch (action) {
        case "add", "a" -> addTopping(topping, pizza);
        case "remove", "r" -> removeTopping(topping, pizza);
        case "" -> addingToppings = false; // continue/done
      }
    }
  }
  
  void addTopping(String toppingName, Pizza pizza) {
    Integer toppingID = tryParseInteger(toppingName);
    Topping topping;
    
    // Get topping from menu
    if (toppingID != null)
      topping = menu.getTopping(toppingID);
    else
      topping = menu.getTopping(toppingName);
    
    // Add topping to pizza
    if (topping != null)
      pizza.addTopping(topping);
    else
      ui.addToppingErrorMessage();
  }
  
  void removeTopping(String toppingName, Pizza pizza) {
    Integer toppingID = tryParseInteger(toppingName);
    Topping topping;
    
    // Get topping from menu
    if (toppingID != null)
      topping = menu.getTopping(toppingID);
    else
      topping = menu.getTopping(toppingName);
    
    // Add topping to pizza
    if (topping != null)
      pizza.addWithdrawnTopping(topping);
    else
      ui.removeToppingErrorMessage();
  }
  
  //Utilities
  public Integer tryParseInteger(String text) {
    try {
      return parseInt(text);
    } catch (NumberFormatException e) {
      return null;
    }
  }
  
  public void chooseList() {
    boolean loop = true;
    while (loop) {
      ui.printSelectOrderList();
      String input = in.nextLine();
      if (tryParseInteger(input) != null) {
        switch (parseInt(input)) {
          case 1 -> {
            displayOrderList(false);
            loop = false;
          }
          case 2 -> {
            displayOrderList(true);
            loop = false;
          }
        }
      }
    }
  }
  
  public void displayOrderList(boolean printFullList) {
    ui.printOrderList(orderList, printFullList);
    ui.orderListContinueMessage();
    in.nextLine();
  }

  public void chooseOrder() {
    boolean loop = true;
    ui.printOrderList(orderList, false);
    Order order = null;
    while (order == null && loop) {
      ui.selectOrderMessage();
      String input = in.nextLine();
      //what does tryParse do
      if (tryParseInteger(input) != null) {
        int orderID = parseInt(input);
        order = orderList.findOrder(orderID); //Returns null if nothing is found
        if (order != null)
          editOrderStatus(order);
        else {
          ui.orderOutOfRangeMessage();
        }
      } else if(input.toLowerCase(Locale.ROOT).contains("exit")) {
        loop = false;
      } else
        ui.ChooseOrderInputErrorMessage();
    }
  }
  
  public void editOrderStatus(Order order) {
    boolean loop = true;
    while (loop) {
      ui.printSelectStatus(order);
      String input = in.nextLine();
      if (tryParseInteger(input) != null) {
        switch (parseInt(input)) {
          case 1 -> order.setStatus(String.valueOf(OrderStatuses.PENDING));
          case 2 -> order.setStatus(String.valueOf(OrderStatuses.READY));
          case 3 -> order.setStatus(String.valueOf(OrderStatuses.DELIVERED));
          case 4 -> order.setPaid(true);
          case 5 -> order.setPaid(false);
          case 6 -> order.setStatus(String.valueOf(OrderStatuses.CANCELED));
          case 7 -> removePizzaFromOrder(order);
          case 8 -> loop = false;
        }
      }
    }
  }
  
  public void removePizzaFromOrder(Order order) {
    boolean notRemovedItem = true;
    Integer index;
    String userInput;
    
    // Until valid number
    while (notRemovedItem) {
      ui.removePizzaFromOrderMessage();
      userInput = in.nextLine();
      index = tryParseInteger(userInput);
      
      // abort
      if (userInput.isEmpty()) return;
      
      // remove
      notRemovedItem = !order.removePizzaID(index);
      
      // remove error
      if (notRemovedItem) ui.removePizzaFromOrderErrorMessage();
    }
  }
  
  public LocalDateTime pickupTimeMenu() {
    Integer hour = null;
    Integer min = null;
    
    // Until time found
    while (hour == null || min == null) {
      ui.pickupTimeMenuMessage();
      String userInput = in.nextLine();
      
      // custom time
      if (userInput.length() == 5) {
        hour = tryParseInteger(userInput.substring(0, 2));
        min = tryParseInteger(userInput.substring(3, 5));
      }
      
      // default time
      if (userInput.isEmpty()) return LocalDateTime.now().plusMinutes(30);
      
      // non-correct time
      if (hour == null || min == null) ui.pickupTimeMenuErrorMessage();
    }
    
    // custom time
    return LocalDateTime.now().withHour(hour).withMinute(min);
  }
  
  public int pizzaQuantityMenu() {
    Integer quantity = null;
    ui.pizzaQuantityMenuMessage();
    
    // Until quantity found
    while (quantity == null) {
      String userInput = in.nextLine();
      
      // default quantity
      if (userInput.isEmpty()) return 1;
      
      // custom quantity
      quantity = tryParseInteger(userInput);
      
      // non-correct quantity
      if (quantity == null) ui.pizzaQuantityMenuErrorMessage();
    }
    
    // custom quantity
    return quantity;
  }
  
  public void run() {
    // Get marios menu
    // orderList
    boolean loop = true;
    
    while (loop) {
      ui.printOrderList(orderList, false);
//      menu = createMenu();
      menu = new Menu("pizza.csv", "topping.csv");
      ui.printMenu(menu);
      loop = mainMenu(loop);
    }
  }
}
