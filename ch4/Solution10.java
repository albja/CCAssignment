
public class Solution10 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	//DFS search to compare the two subtree and see if it is identical. 
	public static boolean isIdentical(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null)	return true;
		if(root1 == null || root2 == null)	return false;		
		if(root1.val != root2.val)	return false;
		if(isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right))
			return true;
		return false;
	}
	
	public static boolean isSubtree(TreeNode root, TreeNode troot) {
		if(root == null || troot == null)	return false;
		if(root.val == troot.val)
			if(isIdentical(root, troot))
				return true;
		return isSubtree(root.left, troot) || isSubtree(root.right, troot);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
