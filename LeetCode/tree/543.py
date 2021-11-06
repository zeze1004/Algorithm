# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    long = 0
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        def dfs(node):
            # print(node)
            if not node:
                return -1
            # 왼쪽, 오른쪽의 각 리프 노드까지 탐색
            #상태값: 말단 노드부터 현재 노드까지 거리
            # 왼쪽 상태값 
            left = dfs(node.left)
            # 오른쪽 상태값
            right = dfs(node.right)
            
            
            # 가장 긴 경로
            # 거리 = 상태값 + 2
            self.long = max(self.long, left + right + 2) # diameterOfBinaryTree 함수에서 long 선언하면 중첩 한수에서 부모 함수 변수 재할당하면 별도의 로컬 변수로 선언되어 부모 함수의 long과 dfs 함수 내 로컬 변수 long 두개가 생겨서 에러 발생

            # 상태값
            return max(left, right) + 1
        
        dfs(root)
        
        return self.long 
