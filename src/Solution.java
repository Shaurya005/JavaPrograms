import java.util.HashMap;

class Solution {


  public static void main(String[] args) {
//    for (int i = 1; i <= 2; i++) {
//      A a = new A();
//      System.out.println(a.countWays("iiv", "ii"));
//    }

    System.out.println(maximizeCuts(4, 2, 1, 1));

    // Here both time it will print different result due to static variable which remains same although both time new object was instantiated.
  }

  static int maximizeCuts(int n, int x, int y, int z)
  {
    //Your code here
    int v[] = {x, y, z};
    int t[][] = new int[n+1][4];
    return maximizeCuts(v, n, v.length);
  }

  static int maximizeCuts(int v[], int length, int n) {
    if (n == 0 || length == 0)
      return 0;
    if (v[n-1] <= length)
      return Math.max(1 + maximizeCuts(v, length - v[n-1], n), maximizeCuts(v, length, n-1));
    return maximizeCuts(v, length, n-1);
  }

}

class A {

  static HashMap<String, Integer> map = new HashMap<>();
  public static int countWays(String s1, String s2) {
    // code here
    util(s1, "");

    return map.getOrDefault(s2, 0);
  }

  static void util(String s1, String res) {
    if (s1.length() == 0) {
      map.put(res, map.getOrDefault(res, 0) + 1);
      return;
    }
    util(s1.substring(1), res);
    util(s1.substring(1), res + s1.charAt(0));
  }
}