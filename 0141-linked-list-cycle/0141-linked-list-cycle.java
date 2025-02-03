/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next != null && head.next.next != null) {
            ListNode slow = head.next;
            ListNode fast = head.next.next;

            while(fast.next != null && fast.next.next != null) {
                if (slow == fast) {
                    return true;
                }
                
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        
        return false;
    }
}