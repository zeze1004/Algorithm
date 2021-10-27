import heapq
from collections import defaultdict
class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        
        graph = collections.defaultdict(list)
        node_time = collections.defaultdict(int)
        
        for start, finish, time in times:
            graph[start].append((finish, time))
            
        Q = [(0, k)]
        
        while Q:
            print(Q)
            time, node = heapq.heappop(Q)
            
            
            if node not in node_time:
                node_time[node] = time
                for finish, times in graph[node]:
                    tmp = (time + times)
                    heapq.heappush(Q, (tmp, finish))
        
        # print(node_time)
        if len(node_time) == n:
            return max(node_time.values())
        return -1
            
        
        
            
        
        
        