/**
 * Created by jacobliu on 15/9/26.
 */
public class Solution10 {
    //matain binary search tree to look up the rank of each number

    static class TreeNode{
        int val;
        int numOfLeftNodes;
        int numOfRightNodes;
        TreeNode parent;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            numOfLeftNodes = 0;
            numOfRightNodes = 0;
            left = null;
            right = null;
            parent = null;
        }
    }
    static TreeNode root;

    //insert element into the binary search tree
    public static void track(int x){
        TreeNode node = new TreeNode(x);
        TreeNode pre = null, scan = root;
        while(scan != null){
            pre = scan;
            if(x > scan.val) {
                scan.numOfRightNodes++;
                scan = scan.right;
            }
            else {
                scan.numOfLeftNodes++;
                scan = scan.left;
            }
        }
        if(pre == null) //empty tree
            root = node;
        else if (x > pre.val)
            pre.right = node;
        else
            pre.left = node;
        node.parent = pre;
    }

    //return the rank of each element, return -1 if such element
    //doesn't exist.
    public static int getRankOfNumber(int x){
        TreeNode scan = root;
        while(scan != null && scan.val != x){
            if(x > scan.val)
                scan = scan.right;
            else
                scan = scan.left;
        }
        return scan == null ? -1 : scan.numOfLeftNodes;
    }

    public static void main(String[] args) {
    }
}
