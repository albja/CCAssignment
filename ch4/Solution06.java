public class Solution06 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		TreeNode(int x) { val = x; }
	}
	
	//given a root, find the minimum elem in that subtree
	public static TreeNode Minimum(TreeNode root){
		if(root == null)	return null;
		while(root.left != null)	
			root = root.left;
		return root;
	}
	
	//find the smallest larger node than root
	public static TreeNode Successor(TreeNode root){
		if(root == null)	return null;
		if(root.right != null)	return Minimum(root.right);
		TreeNode p = root.parent;
		while(p != null && p.right == root){
			root = p;
			p = p.parent;
		}
		return p;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
