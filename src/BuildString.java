import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BuildString {
  public static void main(String[] args) {

    StringBuilder str = new StringBuilder();
    StringBuilder str2 = new StringBuilder();

    // Path to the CSV file
    String csvFile = "/Users/shaurya.jaiswal/Documents/17-Sep.csv";

    // Read the CSV file and store its contents in a set
    Set<String> csvContents = new HashSet<>();
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        for (String value : values) {
          if (csvContents.contains(value.trim())){
            System.out.println(value.trim() + " is repeated");
          } else {
            csvContents.add(value.trim());
            str.append("'" + value.trim() + "',");
            str2.append(value.trim() + ",");
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Number of merchant Ids - " + csvContents);
    System.out.println("Number of merchant Ids - " + csvContents.size());
    System.out.println("String - " + str);
    System.out.println("String - " + str2);
  }
}
