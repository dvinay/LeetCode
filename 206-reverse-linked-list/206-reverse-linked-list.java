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
    public ListNode reverseList(ListNode head) {
        // input: [1->2->3->4->5]
        ListNode previous = null; // previous Node
        ListNode nextNode = null; // next node
        while (head != null) { // previous = null, nextNode = null, head = 1
            nextNode = head.next;
            head.next = previous;
            previous = head;
            head = nextNode;
        }
        return previous;
    }
}