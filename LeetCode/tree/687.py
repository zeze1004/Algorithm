# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    long = 0
    def longestUnivaluePath(self, root: Optional[TreeNode]) -> int:
        def dfs(node):
            if not node:
                return -1
            left = dfs(node.left)
            right = dfs(node.right)

            if node.left and node.left.val == node.val:
                left += 1
            else:
                left = 0
            if node.right and node.right.val == node.val:
                right += 1
            else:
                right = 0
            # 제일 긴 거리 저장
            self.long = max(self.long, right + left)
            # 부모노드의 상태값으로 어느 쪽으로 갈 때 더 많은 거리를 갈 수 있는지 리턴
            return max(left, right)
        dfs(root)
        return self.long