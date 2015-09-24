import java.util.*;

public class Solution09 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; left = null; right = null;}
	}
	
	//merge two sublist to produces all possible subsequences
	public static void Intersect(LinkedList<TreeNode> list1, 
			LinkedList<TreeNode> list2, LinkedList<TreeNode> prefix,
			ArrayList<LinkedList<TreeNode>> ret) {
		if(list1.size() == 0 || list2.size() == 0){
			LinkedList<TreeNode> cpy = (LinkedList<TreeNode>)prefix.clone();
			cpy.addAll(list1);
			cpy.addAll(list2);
			ret.add(cpy);
			return;
		}
		
		//add list node from list1
		TreeNode node = list1.removeFirst();
		prefix.add(node);
		Intersect(list1, list2, prefix, ret);
		prefix.removeLast();
		list1.addFirst(node);
		
		//add list node from list2
		node = list2.removeFirst();
		prefix.add(node);
		Intersect(list1, list2, prefix, ret);
		prefix.removeLast();
		list2.addFirst(node);
	}
		
	//print all the possible arrays that could construct the same tree
	public static ArrayList<LinkedList<TreeNode>>  BSTSequences(TreeNode root){
		ArrayList<LinkedList<TreeNode>> ret = new ArrayList<LinkedList<TreeNode>>();
		if(root == null) {
			ret.add(new LinkedList<TreeNode>());
			return ret;
		}
		LinkedList<TreeNode> seq = new LinkedList<TreeNode>();
		seq.add(root);
		//get all possible sub sequences of both subtrees
		ArrayList<LinkedList<TreeNode>> left = BSTSequences(root.left);
		ArrayList<LinkedList<TreeNode>>	right = BSTSequences(root.right);
		
		//merge the left and right sub sequences
		for(LinkedList<TreeNode> list1 : left){
			for(LinkedList<TreeNode> list2 : right){
				ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
				Intersect(list1, list2, seq, result);
				ret.addAll(result);
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t2.left = t1;
		t3.left = t2;
		t3.right = t4;
		t4.right = t5;
		ArrayList<LinkedList<TreeNode>> ret = BSTSequences(t3);
		for(LinkedList<TreeNode> l : ret){
			for(TreeNode n : l)
				System.out.print(n.val);
			System.out.println();
		}	
	}

}
