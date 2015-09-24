
public class Solution05 {
	static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public static boolean isValidBST(TreeNode root, long lmin, long rmax){
        if(root == null)    return true;
        if(root.val <= lmin || root.val >= rmax)    return false;
        return isValidBST(root.left, lmin, root.val) && isValidBST(root.right, root.val, rmax);
    }
    
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);   
    }
    
	public static void main(String[] args) {

	}

}
