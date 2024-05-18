# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def distributeCoins(self, root: Optional[TreeNode]) -> int:
        self.output = 0
        self.dfs(root, None)

        return self.output
        
    def dfs(self, current, parent):
        if current == None:
            return;
        
        self.dfs(current.left, current)
        self.dfs(current.right, current)

        if current.val < 1:
            self.output += 1 - current.val
            parent.val -= 1 - current.val
        elif current.val > 1:
            self.output += current.val - 1
            parent.val += current.val - 1