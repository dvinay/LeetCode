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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode nextNode = head != null && head.next != null ? head.next : null;
        while(head != null && nextNode != null) {
            if (nextNode != null && head != null && head.val == nextNode.val ) {
                head.next = nextNode.next;
                nextNode = nextNode.next;
            }
            if (nextNode != null && head != null && head.val != nextNode.val) {
                head = head.next;
            }
        }
        return result;
    }
}