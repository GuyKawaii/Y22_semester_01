package car_rental;public class Testing {
  public static void main(String[] args) {
    new Testing().run();
  }
  
  public void run() {
    ElBil elBil = new ElBil("elbil", "Tesla", "3", 2021, 5, 82, 568 , 167.0);
    DieselBil dieselBil = new DieselBil("dieselBil", "Mercedes", "A160", 1997, 5, true, 18.3);
    BenzinBil benzinBil = new BenzinBil("benzinbil", "benzinbil", "benzinbil", 2022, 5, 8, 20.3);
    
    Garage garage = new Garage("New corner");
    garage.addCar(elBil);
    garage.addCar(dieselBil);
    garage.addCar(benzinBil);
    
    System.out.println(garage);
    System.out.println("GrønAfgiftForBilpark: " + garage.beregnGrønAfgiftForBilpark());
  
  }
}
