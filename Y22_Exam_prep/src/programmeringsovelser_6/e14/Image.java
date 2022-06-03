package programmeringsovelser_6.e14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Image {
  private static final Set<String> fileTypes = new HashSet<>(Arrays.asList(
      "gif", "jpg", "jpeg"));
  private String fileName;
  private int width;
  private int height;
  
  public Image(String fileName, int width, int height) {
    setFileName(fileName);
    setWidth(width);
    setHeight(height);
  }
  
  boolean isKnownFileType() {
    String[] parts = fileName.split("\\.");
//    if (parts.length != 2) return false;
    
    if (fileTypes.contains(parts[parts.length - 1])) return true;
    else return false;
  }
  
  boolean isPortrait() {
    return height > width;
  }
  
  boolean isLandscape() {
    // return !isPortrait(); <- goofy but possible
    return width >= height;
  }
  
  // getter setter area
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  
  public void setHeight(int height) {
    this.height = height;
  }
  
  public void setWidth(int width) {
    this.width = width;
  }
}
