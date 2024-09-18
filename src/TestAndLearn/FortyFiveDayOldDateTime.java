package TestAndLearn;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FortyFiveDayOldDateTime {

  public static void main(String[] args) {

    // Get the current date and time
//    LocalDateTime currentDateTime = LocalDateTime.now();
//
//    // Subtract 45 days from the current date and time
//    LocalDateTime olderDateTime = currentDateTime.minusDays(45);
//
//    // Define a DateTimeFormatter for formatting the output
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//    String format = currentDateTime.format(formatter);
//
//    // Print the current date and time
//    System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
//
//    // Print the date and time 45 days ago
//    System.out.println("Date and Time 45 Days Ago: " + olderDateTime.format(formatter));

    List<Long> t = null;
    System.out.println(t.isEmpty());
    System.out.println(getOlderDateTime(90));
    check(true);
  }

  private static String getOlderDateTime(int noOfDays){
    LocalDateTime currentDateTime = LocalDateTime.now();

    LocalDateTime olderDateTime = currentDateTime.minusDays(noOfDays);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String format = currentDateTime.format(formatter);


    return olderDateTime.format(formatter);
  }

  private static void check(boolean isMigration) {
    final List<Integer> expandedItems = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    final int MAX_LIMIT = 8;
    if (isMigration && expandedItems.size() > MAX_LIMIT) {
      System.out.println("Reached");
    }
  }
}
