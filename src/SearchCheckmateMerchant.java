import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SearchCheckmateMerchant {
  public static void main(String[] args) {

    String text = "CWET8HD9QNS51,XAEFWF4SS3QP1,A6QEMQ2TGBNJ1,VH45HQYAW7PD1,6QYG91YF3MET1,J8FECJC3MSAY1,QE2240R18Q8F1,X7K25F71AE7F1,8EPQ7Z6QRH061,MBBFNEJV1B1F1,KYK16EPGQ7EP1,0G7EXHE6YH6V1,7NW0XAR7409S1,9QF1F9F9TFXS1,56X6WCNZA2EZ1,BM5BW073R45X1,7EH8GKQTQC411,R2NA35HPFKK31,K0SSV94TGRW91,0VST5EMAVTM91,9P6AKVW068YS1,JP3Z0R4RERZB1,XVGRSDX2Q7JN1,GGABVBQ8JQZ61,01XPB9G4X45F1,VJEA20N58M6M1,TP4A6TQQ1E411,B72RP6VK4DBT1,3D7RXQM9C8D81,BWAK4SAWS2D91,7RRZ2WS563531,QJGDMXEGWSVX1,S1XTJAAPRJTS1,3VHV9DQMDQS61,M0GARB226VSK1";

    // Split the string by commas
    // List of strings to check
    String[] stringArray = text.split(",");

    Set<String> s = Set.of(stringArray);

    // Path to the CSV file
    String csvFile = "/Users/shaurya.jaiswal/Documents/InstaCheckmate.csv";

    // Read the CSV file and store its contents in a set
    Set<String> csvContents = new HashSet<>();
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        for (String value : values) {
          csvContents.add(value.trim());
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Number of merchant Ids - " + stringArray.length);
    System.out.println("Number of unique merchant Ids - " + s.size());
    System.out.println("Number of Itsa Checkmate merchant Ids - " + csvContents.size());

    // Check if each string in the array is present in the CSV file
    for (String str : stringArray) {
      if (csvContents.contains(str)) {
        System.out.println(str + " is present in the CSV file.");
      }
    }
  }
}
