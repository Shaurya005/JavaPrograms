package DataStructures;// A Java program to demonstrate adjacency list using HashMap and TreeSet representation of graphs using sets.
import java.util.*;
import java.util.LinkedList;
class GraphUsingMap
{
	HashMap<Integer, TreeSet<Integer>> graph = new HashMap<>();
	public void addEdge(int src, int dest) // Add an edge from src to dest and from dest to src into the set
	{
		graph.computeIfAbsent(src, k -> new TreeSet<Integer>());
		if (graph.get(dest) == null)
			graph.put(dest, new TreeSet<Integer>());
		graph.get(src).add(dest);
		graph.get(dest).add(src);
	}

	public void printGraph()
	{
		for (Map.Entry<Integer, TreeSet<Integer>> e : graph.entrySet())
			System.out.println(e.getKey() + "--> " + e.getValue());
	}

	public void searchEdge(int src, int dest)
	{
		Iterator set = graph.get(src).iterator();
		if (graph.get(src).contains(dest))
			System.out.println("Edge from " + src + " to " + dest + " found");
		else
			System.out.println("Edge from " + src + " to " + dest + " not found");
		System.out.println();
	}

	public void bfs(int source) {
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();
		q.add(source);
		visited.put(source, 1);
		while (!q.isEmpty()) {
			int f = q.poll();
			System.out.print(f+" ");
			for(int i : graph.get(f))
				if(visited.get(i)==null) {
					q.add(i);
					visited.put(i,1);
				}
		}
		System.out.println();
	}

	public void dfs(int source) {
		HashMap<Integer, Integer> visited = new HashMap<>();
		Stack<Integer> s = new Stack<>();
		s.add(source);
		visited.put(source, 1);
		while (!s.isEmpty()) {
			int f = s.pop();
			System.out.print(f+" ");
			for(int i : graph.get(f))
				if(visited.get(i)==null) {
					s.add(i);
					visited.put(i,1);
				}
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Queue<Integer> q=new LinkedList<>();
		GraphUsingMap g = new GraphUsingMap();
		g.addEdge(10, 11);
		g.addEdge(10, 20);
		g.addEdge(11, 20);
		g.addEdge(11, 15);
		g.addEdge(15, 14);
		g.addEdge(14, 20);
		g.addEdge(20, 13);
		g.addEdge(13, 30);
		g.addEdge(14, 30);
		g.addEdge(13, 25);
		g.addEdge(30, 22);

		g.printGraph(); // Print the adjacency list representation of the above graph

		g.searchEdge(20, 10); // Search the given edge in the graph
		g.searchEdge(10, 13);

		g.bfs(10);
		g.dfs(10);
	}
}