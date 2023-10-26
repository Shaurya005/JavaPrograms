package DataStructures;

import java.util.*;
import java.util.LinkedList;

class Graph {
	static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v)	// A utility function to add an edge in an undirected graph
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void printGraph(ArrayList<ArrayList<Integer> > adj)
	{
		for (int i = 0; i < adj.size(); i++) {
			System.out.println("\nAdjacency list of vertex " + i);
			System.out.print(i);
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(" -> "+adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	static void bfs(ArrayList<ArrayList<Integer> > list, int source,int V){
		Queue<Integer> q = new LinkedList<>();
		Boolean[] visited = new Boolean[V];
		Arrays.fill(visited, false);

		q.add(source);
		visited[source] = true;
		while(!q.isEmpty()){
			int f = q.poll();
			System.out.println(f);

			//Push the nbrs of current node inside q if they are not already visited
			for(int nbr : list.get(f)){
				if(!visited[nbr]){
					q.add(nbr);
					visited[nbr] = true;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int V = 5;
		ArrayList<ArrayList<Integer> > adj = new ArrayList<>(V);
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
		printGraph(adj);
		bfs(adj,2,V);
	}
}
//	Pros: Saves space O(|V|+|E|) . In the worst case, there can be C(V, 2) number of edges in a graph thus consuming O(V^2) space. Adding a vertex is easier.
//	Cons: Queries like whether there is an edge from vertex u to vertex v are not efficient and can be done O(V).