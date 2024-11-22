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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>(); 
        if (root == null) return output;
        if (root != null) output.add(root.val);
        if (root.right != null) findNode(root.right, output, 1);
        if (root.left != null) findNode(root.left, output, 1);

        return output;
    }

    private void findNode(TreeNode node, List<Integer> output, int depth) {
        if (node == null) {
            return;
        }
        if (depth >= output.size()) {
            // System.out.println("depth: " + depth + " val: " + node.val);
            output.add(node.val);
        }
        
        findNode(node.right, output, depth + 1);
        findNode(node.left, output, depth + 1);
    }

    // private void findLeftNode(TreeNode node, List<Integer> output, int idx) {
    //     if (node == null) {
    //         return;
    //     }

    //     System.out.println(idx + " " + node.val);

    //     if (idx < output.size()) {
    //         findLeftNode(node.right, output, idx + 1);
    //         findLeftNode(node.left, output, idx + 1);
    //     }
    //     if (idx >= output.size()) {
    //         output.add(node.val);
    //         findLeftNode(node.right, output, idx + 1);
    //         findLeftNode(node.left, output, idx + 1);
    //     }
    // }  
}