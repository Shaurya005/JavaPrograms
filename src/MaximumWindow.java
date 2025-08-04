import java.util.*;

public class MaximumWindow {
  // Function to find maximum of each subarray of size k.

  public static void main(String[] args) {
    ArrayList<Integer> l = max_of_subarrays(new int[]{67, 76, 2, 2, 98}, 1);
  }
  public static ArrayList<Integer> max_of_subarrays(int arr[], int k) {
    // Your code here
    // PriorityQueue<Pair> p = new PriorityQueue<>((a,b) -> b.v - a.v);
    // ArrayList<Integer> list = new ArrayList<>();
    // int i, l = arr.length;
    // for (i = 0; i<k;i++)
    //     p.add(new Pair(arr[i], i));
    // list.add(p.peek().v);
    // for (i = k; i < l;i++) {
    //     p.add(new Pair(arr[i], i));
    //     while(p.peek().i <= i-k)
    //         p.poll();
    //     list.add(p.peek().v);
    // }
    // return list;

    ArrayList<Integer> ans = new ArrayList<>();
    TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());

    for (int i = 0; i < k; i++) {
      treeMap.put(i, arr[i]);
    }

    ans.add(treeMap.firstKey());

    for (int i = k; i < arr.length; i++) {
      treeMap.put(i, arr[i]);

      treeMap.remove(i - k);

      ans.add(treeMap.firstEntry().getValue());
    }

    return ans;
  }

  // class Pair {
  //     int v, i;
  //     Pair(int v, int i) {
  //         this.v = v;
  //         this.i = i;
  //     }
  // }
}