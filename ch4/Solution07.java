import java.util.*;

public class Solution07 {
	static class Project{
		String name;
		int num;	//number of project
		ArrayList<Project> neighbor = new ArrayList<Project>();
		HashMap<String, Project> dict = new HashMap<String, Project>();
	}
	
	static class Graph{
		ArrayList<Project> nodes = new ArrayList<Project>();
		HashMap<String, Project> dic = new HashMap<String, Project>();
	}
	
	//use DFS to push all the dependencies of the node v into the stack first
	public static void TopologicalDFS(Graph graph, int v, boolean[] visited, Stack<Project> st){
		visited[v] = true;
		Project n = graph.nodes.get(v);
		for(Project node : n.neighbor){
			if(!visited[node.num])
				TopologicalDFS(graph, node.num, visited, st);
		}
		st.push(n);
	}
	
	public static ArrayList<Project> TopologicalSort(Graph graph, int N){
		ArrayList<Project> ret = new ArrayList<Project>();
		Stack<Project> st = new Stack<Project>();
		boolean[] visited = new boolean[N];	//N is the number of nodes in graph
		for(int i=0; i<N; ++i)	visited[i] = false;
		
		//use DFS to do topological sort, store dependencies on the stack
		for(int i=0; i<N; ++i){
			if(!visited[i])
				TopologicalDFS(graph, i, visited, st);		
		}
		while(!st.isEmpty())
			ret.add(st.pop());
		return ret;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
