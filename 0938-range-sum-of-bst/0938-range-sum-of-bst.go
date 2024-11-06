/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func rangeSumBST(root *TreeNode, low int, high int) int {
    output := 0
    fmt.Printf("output first: %d\n", output)
    if root == nil {
        return output;
    }
    if root.Val <= high && root.Val >= low {
        output += root.Val
    }

    output += rangeSumBST(root.Left, low, high)
    output += rangeSumBST(root.Right, low, high)

    return output
}