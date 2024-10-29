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

        ListNode afterMidNode = slow.next;  // 가운데 노드의 next 노드
        slow.next = null;                   // 중간 이후의 노드를 만들어주기위해 연결고리 제거. 
        ListNode head2 = null;              // 뒤집어진 중간노드들 링크드리스트 중 맨 앞을 차치할 포인터
                                            // head2 뒤에 중간노드들을 붙여줌
        // afterMidNode부터 끝까지 뒤집기
        while (afterMidNode != null) {
            ListNode next = afterMidNode.next;
            afterMidNode.next = head2;
            head2 = afterMidNode;
            afterMidNode = next;
        }
        // 결과적으로 afterMidNodes는 원래 head의 끝 노드를 가리킴
        // ex. head = [1,2,3,4,5]
        // while문이 끝났을 때의 head2 = [5, 4]
        
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