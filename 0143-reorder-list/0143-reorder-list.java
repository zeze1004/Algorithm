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

        ListNode afterMidNodes = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (afterMidNodes != null) {
            ListNode next = afterMidNodes.next;
            afterMidNodes.next = prev;
            prev = afterMidNodes;
            afterMidNodes = next;
        }
        
        ListNode head1 = head;
        ListNode head2 = prev;
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