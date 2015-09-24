import java.util.*;

public class Solution12 {
	static int count = 0;
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	//top-down DFS search to sum the value of the nodes and check if it is equal
	//to specific value.
	public static void DFSSearchPath(TreeNode root, int sum){
		if(root == null)	return;
		if(root.left == null && root.right == null && root.val == sum){
			count++;
			return;
		}
		DFSSearchPath(root.left, sum-root.val);
		DFSSearchPath(root.left, sum-root.val);
	}

	public static int SumPath(TreeNode root, int sum){
		DFSSearchPath(root, sum);
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
