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
class Solution {
    int output = 0;
    public int distributeCoins(TreeNode root) {
        dfs(root, null);

        return output;
    }

    public void dfs(TreeNode root, TreeNode parent) {
        if (root == null) return;

        System.out.printf("root.val: %d\n", root.val);

        dfs(root.left, root);
        dfs(root.right, root);
        
        if (root.val < 1) {
            System.out.printf("root.val < 1\n");
            System.out.printf("root.val: %d\n", root.val);
            System.out.printf("parent.val: %d\n", parent.val);
            output += (1 - root.val);
            parent.val -= (1 - root.val); 
            System.out.printf("After\n");
            System.out.printf("root.val: %d\n", root.val);
            System.out.printf("parent.val: %d\n", parent.val);
        }
        else if(root.val > 1) {
            System.out.printf("root.val > 1\n");
            System.out.printf("root.val: %d\n", root.val);
            System.out.printf("parent.val: %d\n", parent.val);
            output += root.val - 1;
            parent.val += root.val - 1; 
            System.out.printf("After\n");
            System.out.printf("root.val: %d\n", root.val);
            System.out.printf("parent.val: %d\n", parent.val);
        }
    }
}