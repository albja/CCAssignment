public class Solution04 {
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; left = null; right = null;}
	}
	
	//compute the height of any subtree
    public static int getHeight(TreeNode root){
        if(root == null)   return 0;
        //the height of the tree equals the larger height of its children + 1
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    
    //check whether the tree is balanced
    public static boolean isBalanced(TreeNode root) {
        if(root == null)    return true;
        int d = Math.abs(getHeight(root.left) - getHeight(root.right));
        if(d > 1)   return false;
        //check whether the subtree of each node is balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
