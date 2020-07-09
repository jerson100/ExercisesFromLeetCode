/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        int rspt[] = new int[1];
        findTiltRecursive(root,rspt);
        return rspt[0];
    }
    public int findTiltRecursive(TreeNode root, int[] rspt){
        if(root == null) return 0;
        int left = findTiltRecursive(root.left,rspt);
        int right = findTiltRecursive(root.right,rspt);
        rspt[0] = rspt[0] + Math.abs(left-right);
        return root.val + left + right;
    }
}