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

        // 현재의 노드가 부모노드로 전달
        dfs(root.left, root);
        dfs(root.right, root);
        
        // 부모의 코인이 자식에게 이동해야함
        // 이동하는 코인의 갯수가 곧 이동 횟수
        if (root.val < 1) {
            output += (1 - root.val);
            parent.val -= (1 - root.val); 
        }
        // 현재 노드의 코인이 1보다 많은 경우, 1 - root.val 코인을 부모에게 이동
        else if(root.val > 1) {
            output += root.val - 1;
            parent.val += root.val - 1; 
        }
    }
}