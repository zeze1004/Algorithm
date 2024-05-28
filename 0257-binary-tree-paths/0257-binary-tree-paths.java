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
        if (root != null) {
            backtrack(root, output, new StringBuilder());
        }
        return output;
    }

    private void backtrack(TreeNode root, List<String> output, StringBuilder sb) {
        if (root == null) return;

        int len = sb.length(); // 현재 경로 길이를 저장
        sb.append(root.val);

        if (root.left == null && root.right == null) {
            output.add(sb.toString());
        } else {
            sb.append("->");
            if (root.left != null) backtrack(root.left, output, sb);
            if (root.right != null) backtrack(root.right, output, sb);
        }

        sb.setLength(len); // 원래 길이로 복원
    }
}