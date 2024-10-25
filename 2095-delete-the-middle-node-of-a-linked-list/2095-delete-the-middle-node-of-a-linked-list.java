/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        // 길이 구하기
        int num = 0;
        ListNode tmp = head;
        while (tmp != null) {
            num++;
            tmp = tmp.next;
        }

        tmp = head;
        int resultIndex = num / 2 - 1;
        for (int i = 0; i < resultIndex; i++) {
            tmp = tmp.next;
        }

        // 중간 노드 삭제
        if (tmp != null && tmp.next != null) {
            tmp.next = tmp.next.next;
        }

        return head;
    }
}