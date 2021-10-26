from collections import defaultdict

class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        course = defaultdict(list)
        
        traced = set()
        visited = set()
        
        def dfs(num):
            if num in traced:
                return False
            if num in visited:
                return True
            
            traced.add(num)
            
            for i in course[num]:
                if dfs(i) == False:
                    return False
            
            traced.remove(num)
            visited.add(num)
            
            return True
            
            
            
        
        
        for a, b in prerequisites:
            course[a].append(b)
        # print(course)
        
        for i in list(course):
            if dfs(i) == False:
                return False
            
        return True
        