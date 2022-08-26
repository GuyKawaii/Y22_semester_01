package programmeringsovelser_2.e6;

public class Car {
  private Trailer trailer;
  private int weight;
  private static final int WEIGHT_LIMIT = 3500;
  
  public Car(int weight) {
    setWeight(weight);
    setTrailer(null);
  }
  
  public void setTrailer(Trailer trailer) {
    if (trailer == null)
      this.trailer = null;
    
    else if ((weight + trailer.getWeight()) <= WEIGHT_LIMIT)
      this.trailer = trailer;
    
    else
      throw new LargeTrailerException(String.format("car %skg and trailer %skg above weight-limit %skg",
          weight,
          trailer.getWeight(),
          WEIGHT_LIMIT));
  }
  
  public int totalWeight() {
    if (trailer == null) return weight;
    else return weight + trailer.getWeight();
  }
  
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  public int getWeight() {
    return weight;
  }
}
