from collections import defaultdict
answer = []

def dfs(airport, tickets_dic):
    while tickets_dic[airport]:
        dfs(tickets_dic[airport].pop(0), tickets_dic)
    answer.append(airport)
        
    

def solution(tickets):
    ticket_dic = defaultdict(list)
    
    for start, finish in sorted(tickets):
        ticket_dic[start].append(finish)
    print(ticket_dic)
    dfs('ICN', ticket_dic)
    
    
    
    return answer[::-1]