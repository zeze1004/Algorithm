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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> output = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        
        if (root.left == null && root.right == null) {
            output.add(sb.toString());
            return output;
        }
        if (root.left != null) recursive(root.left, output, new StringBuilder(sb));
        if (root.right != null) recursive(root.right, output, new StringBuilder(sb));

        return output;
    }

    private void recursive(TreeNode root, List<String> output, StringBuilder sb) {
        if (root.left == null && root.right == null) {
            sb.append('-').append('>');
            sb.append(root.val);
            // output.add(sb.toString());
            output.add(new StringBuilder(sb).toString());
            return;
        }
        if (root == null) return;

        sb.append('-').append('>');
        sb.append(root.val);

        if (root.left != null) recursive(root.left, output, new StringBuilder(sb));
        if (root.right != null) recursive(root.right, output, new StringBuilder(sb));
    }
}