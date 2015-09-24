
public class Solution02 {
	static class TreeNode{
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; left = null; right = null; }
	 }

    public static TreeNode buildTree(int left, int right, int[] nums){
        if(left > right)    return null;
        //take middle elem of the array as the root node
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(left, mid-1, nums);
        node.right = buildTree(mid+1, right, nums);
        return node;
    }
    
    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(0, nums.length-1, nums);
    }    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
