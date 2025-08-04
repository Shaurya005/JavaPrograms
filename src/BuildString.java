import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Trie {
  boolean isLeafNode;
  Trie[] childs;

  Trie() {
    childs = new Trie[26];
    isLeafNode = false;
  }

  void insert(String word) {
    Trie root = this;
    for (char ch : word.toCharArray()) {
      if (root.childs[ch - 'a'] == null) {
        root.childs[ch-'a'] = new Trie();
      }
      root = root.childs[ch-'a'];
    }
    root.isLeafNode = true;
  }

  void search(String A, int i, Map<Integer, List<Integer>> map) {
    Trie root = this;
    int n = A.length();
    for (int j = i; j < n; j++) {
      char ch = A.charAt(j);
      if (root.childs[ch - 'a'] == null)
        return;
      root = root.childs[ch-'a'];
      if (root.isLeafNode) {
        if (!map.containsKey(i))
          map.put(i, new ArrayList<>());
        map.get(i).add(j);
      }
    }
    // return root.isLeafNode == true;
  }
}

public class BuildString {

  public static int wordBreak(String A, List<String> B) {
    // code here
    Trie root = new Trie();
    B.forEach(s -> root.insert(s));
    Map<Integer, List<Integer>> map = new TreeMap<>();
    int n = A.length();
    for (int i = 0; i < n; i++) {
      root.search(A, i, map);
    }
    int prev = 0;
    for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
      if (!map.containsKey(prev))
        return 0;
      int i = entry.getKey();
      List<Integer> list = entry.getValue();
      prev = list.get(0) + 1;
    }
    return prev == n ? 1 : 0;
  }

  public static void main(String[] args) {

//    System.out.println(areIsomorphic("dyhnjitfuexuxgauaxekaqc", "meghoqtclljtuwgladtgfun"));
//    System.out.println(wordBreak("oklike", Arrays.asList("ok", "like", "sam", "sung", "samsung")));
    commonElements(Arrays.asList(1, 5, 10, 20, 40, 80), Arrays.asList(6, 7, 20, 80, 100), Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120));
//    StringBuilder str = new StringBuilder();
//    StringBuilder str2 = new StringBuilder();
//
//    TreeMap<Integer, Integer> m = new TreeMap<>();
//    m.pollFirstEntry();
//    Set<Integer> sss = m.keySet();
//    Integer a[] = new Integer[1];
//    sss.toArray(a);
//    Collection<Integer> values1 = m.values();
//    List<Integer> list = new ArrayList<>();
//    list.toArray();
//    Object[] array = values1.toArray();
//
//
//    Collections.reverseOrder();
//
//    // Path to the CSV file
//    String csvFile = "/Users/shaurya.jaiswal/Documents/Book123.csv";
//
//    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//    Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
//    map.put(1, new ArrayList<>(Arrays.asList(1, 2, 3)));
//
//    result = (ArrayList<ArrayList<Integer>>) map.values();
//    System.out.println(result);
//
//    // Read the CSV file and store its contents in a set
//    Set<String> csvContents = new HashSet<>();
//    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//      String line;
//      while ((line = br.readLine()) != null) {
//        String[] values = line.split(",");
//        for (String value : values) {
//          if (csvContents.contains(value.trim())){
//            System.out.println(value.trim() + " is repeated");
//          } else {
//            csvContents.add(value.trim());
//            str.append("'" + value.trim() + "',");
//            str2.append(value.trim() + ",");
//          }
//        }
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    System.out.println("Number of merchant Ids - " + csvContents);
//    System.out.println("Number of merchant Ids - " + csvContents.size());
//    System.out.println("String - " + str);
//    System.out.println("String - " + str2);
  }

  public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                      List<Integer> arr3) {
    // Code Here
    return common(common(arr1, arr2), arr3);
  }

  private static List<Integer> common(List<Integer> arr1, List<Integer> arr2) {
    Set<Integer> set = new LinkedHashSet<>();
    int n1 = arr1.size(), n2 = arr2.size(), i = 0, j = 0;
    Integer[] temp = new Integer[n1];
    arr1.toArray(temp);
    while (i < n1 && j < n2) {
      while (i < n1 && arr1.get(i) < arr2.get(j))
        i++;
      while (i < n1 && j < n2 && arr2.get(j) < arr1.get(i))
        j++;
      if (i < n1 && j < n2 && arr1.get(i) == arr2.get(j)) {
        if (!set.contains(arr1.get(i)))
          set.add(arr1.get(i));
        int a = 12;
        char ch = (char) ('a' +a);
        Set<String> set2 = new LinkedHashSet<>();

        i++;j++;
      }
    }
    Map<Integer, List<Integer>> map = new LinkedHashMap<>();
    return new ArrayList<>(set);
  }

  public static boolean areIsomorphic(String s1, String s2) {
    // Your code here
    int n1 = s1.length(), n2 = s2.length();
    if (n1 != n2)
      return false;
    Map<Character, Integer> freqMap1 = new HashMap<>();
    Map<Character, Integer> freqMap2 = new HashMap<>();
    for (int i = 0; i < n1; i++) {
      char ch1 = s1.charAt(i), ch2 = s2.charAt(i);
      freqMap1.put(ch1, freqMap1.getOrDefault(ch1, 0) + 1);
      freqMap2.put(ch2, freqMap2.getOrDefault(ch2, 0) + 1);
    }
    if (freqMap1.size() != freqMap2.size())
      return false;

    TreeMap<Character, Integer> map1 = new TreeMap<>((a, b) -> {
      if (freqMap1.get(b) != freqMap1.get(a))
        return freqMap1.get(b) - freqMap1.get(a);
      return a.compareTo(b);
    });
    map1.putAll(freqMap1);
    TreeMap<Character, Integer> map2 = new TreeMap<>((a, b) -> {
      if (freqMap2.get(b) != freqMap2.get(a))
        return freqMap2.get(b) - freqMap2.get(a);
      return a.compareTo(b);
    });
    map2.putAll(freqMap2);

    for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
      if (map2.pollFirstEntry().getValue() != entry.getValue())
        return false;
    }
    return true;
  }
}
