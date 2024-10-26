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
    public ListNode middleNode(ListNode head) {
        ListNode tmp = head;
        int num = 1;
        while (tmp.next != null) {
            num++;
            tmp = tmp.next;
        }

        tmp = head;
   
        for (int i = 0; i < num / 2; i++) {
            tmp = tmp.next;
        }

        return tmp;
    }
}