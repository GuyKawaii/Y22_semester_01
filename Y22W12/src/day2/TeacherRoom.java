package day2;

public class TeacherRoom extends Room {
  private String typeGameConsole;
  private String typeHotDrinkMachine;
  
  TeacherRoom(String roomNumber, int maxNumberPeople, String typeGameConsole, String typeHotDrinkMachine) {
    super(roomNumber, maxNumberPeople);
    
    setTypeGameConsole(typeGameConsole);
    setTypeHotDrinkMachine(typeHotDrinkMachine);
  }
  
  public void setTypeGameConsole(String typeGameConsole) {
    this.typeGameConsole = typeGameConsole;
  }
  
  public String getTypeGameConsole() {
    return typeGameConsole;
  }
  
  public void setTypeHotDrinkMachine(String typeHotDrinkMachine) {
    this.typeHotDrinkMachine = typeHotDrinkMachine;
  }
  
  public String getTypeHotDrinkMachine() {
    return typeHotDrinkMachine;
  }
  
  @Override
  public String toString() {
    return String.format("""
                         %s
                         typeGameConsole: %s
                         typeHotDrinkMachine: %s
                         """,
        super.toString(),
        typeGameConsole,
        typeHotDrinkMachine);
  }
}
