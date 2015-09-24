public class Solution08 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	//if current tree contains both nodes q and p, then return the root.
	//if one of the nodes is contained in the subtree, then return the subtree
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        return l == null ? r : r == null ? l : root;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
