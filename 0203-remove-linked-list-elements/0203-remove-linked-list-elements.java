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
    public ListNode removeElements(ListNode head, int val) {
        ListNode tempHead = head;
        ListNode prev = null;
        
        while (head != null) {
            if (head.val == val) {
                // head is first node
                if (prev == null) {
                    head = head.next;
                    tempHead = head;
                } else { 
                    // head is middle node or tail node
                    prev.next = head.next;
                    head = head.next;
                }
            } else {
                prev = head;
                head = head.next;
            }
        }
        return tempHead;
    }
}