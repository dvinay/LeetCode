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
        // reference for head
        ListNode result = head;
        
        if (result != null) {
            ListNode nextNode = head.next; // next pointer to find duplicate
            while(head != null && nextNode != null) {
                // if duplicate element. make head next skip to next
                if (head.val == nextNode.val ) {
                    head.next = nextNode.next;
                    nextNode = nextNode.next;
                }
                if (nextNode != null && head != null && head.val != nextNode.val) {
                    head = head.next;
                }
            }
        }
        return result;
    }
}