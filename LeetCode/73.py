class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        row = len(matrix)
        col = len(matrix[0])

        visited = [[False for x in range(col)] for y in range(row)]

        for y in range(row):
            for x in range(col):
                if not visited[y][x] and matrix[y][x] == 0:
                    visited[y][x] = True
                    for cur_y in range(row):
                        if matrix[cur_y][x] != 0:
                            matrix[cur_y][x] = 0
                            visited[cur_y][x] = True
                    for cur_x in range(col):
                        if  matrix[y][cur_x] != 0:
                            matrix[y][cur_x] = 0
                            visited[y][cur_x] = True
        return matrix
