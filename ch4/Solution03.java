import java.util.*;

public class Solution03 {
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; left = null; right = null;}
	}
	//use BSF to construct tree level linked list
	public static ArrayList<LinkedList<TreeNode>> listOfDepths(TreeNode root){
		ArrayList<LinkedList<TreeNode>> ret = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> qe = new LinkedList<TreeNode>();
		if(root != null)	qe.add(root);
		//use a queue to construc linked list for each level of tree
		while(!qe.isEmpty()){
			ret.add(qe);
			LinkedList<TreeNode> tmp = qe;
			qe = new LinkedList<TreeNode>();
			for(TreeNode node : tmp){
				if(node.left != null)
					qe.add(node.left);
				if(node.right != null)
					qe.add(node.right);
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
