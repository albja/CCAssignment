import java.util.*;

public class Solution01 {
	static class Node{
		int val;
		public ArrayList<Node> neighbor = new ArrayList<Node>();
		boolean visited = false;
		Node(int x) {
			val = x;
		}
		ArrayList<Node> getNeighbor() { return neighbor; }
	}

	static class Graph{
		ArrayList<Node> nodes;
		public ArrayList<Node> getNode() { return nodes; }
	}
	//Breadth-First Search
	public static boolean findRoute(Graph g, Node start, Node end){
		LinkedList<Node> qe = new LinkedList<Node>();
		start.visited = true;
		qe.add(start);
		
		while(!qe.isEmpty()){
			Node tmp = qe.removeFirst();
			//use queue to store neighbors, traversing level by level
			for(Node node : tmp.getNeighbor()){
				if(!node.visited){
					if(node == end)
						return true;
					else{
						node.visited = true;
						qe.add(node);
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
