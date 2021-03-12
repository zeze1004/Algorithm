# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

import collections

# 연결리스트를 리스트로 변환해서 팰린드롬 판별


class Solution:
    def isPalindrome_list(self, head) -> bool:
        # print(head): ListNode{val: 1, next: ListNode{val: 2, next: ListNode{val: 2, next: ListNode{val: 1, next: None}}}}
        q = []

        if not head:
            return True

        node = head

        # 리스트 변환
        while node is not None:
            q.append(node.val)
            # 링크드리스트 마지막은 None이 되므로 반복문 종료
            node = node.next

        # 팰린드롬 판별
        while len(q) > 1:
            if q.pop(0) != q.pop():
                return False
        return True

# 연결리스트를 deque로 변환해서 팰린드롬 판별
    def isPalindrome_deque(self, head) -> bool:
        # print(head): ListNode{val: 1, next: ListNode{val: 2, next: ListNode{val: 2, next: ListNode{val: 1, next: None}}}}
        q = collections.deque()

        if not head:
            return True

        node = head

        # 리스트 변환
        while node is not None:
            q.append(node.val)
            # 링크드리스트 마지막은 None이 되므로 반복문 종료
            node = node.next

        # 팰린드롬 판별
        while len(q) > 1:
            if q.popleft() != q.pop():
                return False
        return True
