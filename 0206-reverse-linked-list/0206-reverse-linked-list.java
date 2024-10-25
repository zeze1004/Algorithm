/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;         // 노드의 값
 *     ListNode next;   // 다음 노드를 가르키는 포인터
 *     // 생성자
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /** ListNode 선언 법
 * ListNode node1 = new ListNode(1);        // val = 1, next = null로 초기화
 * ListNode node2 = new ListNode(2, node1); // val = 2, next = node1로 초기화
 * ListNode node3 = new ListNode(3, node2); // val = 3, next = node2로 초기화
 * // 3 -> 2 -> 1 -> null
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // ListNode 객체를 가르킬 수 있는 참조변수

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
}