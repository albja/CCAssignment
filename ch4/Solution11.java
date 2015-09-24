import java.util.*;

public class Solution11 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		TreeNode(int x) { val = x; left = null; right = null; parent = null; }
	}
	static TreeNode t = null;
	
	//search for a node with the given key in a binary search tree
	public static TreeNode Search(TreeNode root, int key){
		while(root != null && root.val != key){
			if(root.val < key)	root = root.right;
			else	root = root.left;
		}
		return root;
	}
	
	//given a root, find the minimum elem in that subtree
	public static TreeNode Minimum(TreeNode root){
		if(root == null)	return null;
		while(root.left != null)	
			root = root.left;
		return root;
	}
		
	//Insert value k into the binary search tree
	public static void insert(TreeNode r, int k){
		TreeNode t1 = new TreeNode(k);
		TreeNode p = null, scan = r;
		while(scan != null){
			p = scan;
			if(k < scan.val)	scan = scan.left;
			else	scan = scan.right;
		}
		t1.parent = p;
		if(p == null)	t = t1;	//tree is empty
		else if(k < p.val)	p.left = t1;
		else p.right = t1;
	}
	
	//replace one subtree as a child of its parent with another subtree
	public static void transplant(TreeNode root, TreeNode t1){
		if(root == null || root.parent == null)	t = t1;
		else if(root.parent.left == root)	
			root.parent.left = t1;
		else
			root.parent.right = t1;
		if(t != null)
			t1.parent = root.parent;
	}
	
	//delete a node from the binary seach tree
	public static void delete(TreeNode t){
		if(t == null)	return;
		if(t.left == null)	transplant(t,t.right);
		else if(t.right == null)	transplant(t, t.left);
		else{
			TreeNode succ = Minimum(t.right);
			if(succ.parent != t){
				transplant(succ, succ.right);
				succ.right = t.right;
				succ.right.parent = succ;
			}
			transplant(t,succ);
			succ.left = t.left;
			succ.left.parent = succ;
		}
	}
	
	public static void display(TreeNode r){
		if(r == null) return;
		System.out.print(r.val+" ");
		display(r.left);
		display(r.right);
	}
	
	//use BFS to traverse the tree, the kth node have 1/k to be selected
	public static TreeNode getRandomNode(TreeNode root){
		LinkedList<TreeNode> qe = new LinkedList<TreeNode>();
		qe.add(root);
		int count = 1;
		TreeNode ret = root;
		//the probability for kth node to be selected is 
		//1/k/*k/(k+1)/*(k+1)/(k+2)*....(n-1)/n = 1/n
		while(!qe.isEmpty()){
			TreeNode n = qe.removeFirst();
			if(1.0/count >= Math.random())
				ret = n;
			if(n.left != null)	qe.add(n.left);
			if(n.right != null)	qe.add(n.right);
			count++;	
		}
		return ret;
	} 
	
	public static void main(String[] args) {
		insert(t,3);
		insert(t,2);
		insert(t,1);
		insert(t,4);
		insert(t,5);
		display(t);
		System.out.println();
		for(int i=0; i<10; i++)
			//System.out.println(getRandomNode(t).val);
		delete(Search(t,2));
		display(t);
		System.out.println();	
		delete(Search(t,3));
		display(t);
		System.out.println();
		
		
		
	}

}
