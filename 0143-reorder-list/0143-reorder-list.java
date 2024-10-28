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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode midNode = slow.next;
        slow.next = null;
        ListNode afterMidNodes = null; // afterMidNodes에 head의 중간노드들을 뒤집어서 붙여줌
        // midNode부터 끝까지 뒤집기
        while (midNode != null) {
            ListNode next = midNode.next;
            midNode.next = afterMidNodes;
            afterMidNodes = midNode;
            midNode = next;
        }
        // 결과적으로 afterMidNodes는 원래 head의 끝 노드를 가리킴
        // ex. head = [1,2,3,4,5]
        // 처음 midNode = 3
        // while문이 끝났을 때의 afterMidNodes = [5, 4, 3]
        
        ListNode head2 = afterMidNodes;
        while (head2 != null) {
            ListNode next1 = head.next;
            ListNode next2 = head2.next;

            head.next = head2;
            head2.next = next1;

            head = next1;
            head2 = next2;
        }
    }
}