class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        output = [0] * len(mat) * len(mat[0])
        x: int = 0
        y: int = 0
        count: int = 0

        while count < len(mat) * len(mat[0]):
            
            # 우상향 대각선
            while x >= 0 and y < len(mat[0]):
                output[count] = mat[x][y]
                x-=1
                y+=1
                count+=1
            
            # 좌하향 대각선 시작점 조정
            if y == len(mat[0]):
                x+=2
                y-=1
            else: 
                x+=1
            
            # 좌하향 대각선
            while y >= 0 and x < len(mat):
                output[count] = mat[x][y]
                x+=1
                y-=1
                count+=1
            
            # 우상향 대각점 시작점 조정
            if x == len(mat):
                x-=1
                y+=2
            else:
                y+=1

        return output