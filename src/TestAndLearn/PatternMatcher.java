package TestAndLearn;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

  public static final Pattern NONSTANDARD_UTF_PATTERN = Pattern.compile("[^A-Za-z 0-9]");

  public static void main(String[] args) {
    System.out.println(utf8Filter(Optional.of("name=like= Hello Man    Blue @#&% X🤓 +!?|😃")));
  }

  public static String replaceAll(Pattern pattern, CharSequence source, String replacement) {
    if (source == null) {
      return null;
    }
    if (replacement == null) {
      replacement = "";
    }

    return pattern.matcher(source).replaceAll(replacement);
  }

  public static String utf8Filter(Optional<String> str) {
    final String NAME_LIKE_SEARCH_STRING = "name=like=";
    String searchString = str.orElse("");
    String searchKeyword = searchString.startsWith(NAME_LIKE_SEARCH_STRING) ? searchString.substring(10) : searchString;
    Matcher m = NONSTANDARD_UTF_PATTERN.matcher(searchKeyword);

    return m.find() ? NAME_LIKE_SEARCH_STRING+replaceAll(NONSTANDARD_UTF_PATTERN, searchKeyword, "").trim() : searchKeyword;
  }
}
