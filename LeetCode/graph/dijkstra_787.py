import collections
import heapq
class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        graph = collections.defaultdict(list)
        for u, v, w in flights:
            graph[u].append([v, w])
        
        visit = {}
        Q = [(0, src, 0)]
        while Q:
            price, node, num = heapq.heappop(Q)
            if node == dst:
                return price
            if node not in visit or visit[node] > num: # 방문한 노드여도 경유지 수가 더 작을 경우에는 경유지 수 바꿈
                visit[node] = num
                for v, w in graph[node]:
                    if num <= k:
                        alt = price + w
                        heapq.heappush(Q, (alt, v, num + 1))
        return -1