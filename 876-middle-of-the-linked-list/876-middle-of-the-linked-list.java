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
        int count = 0;
        ListNode mid = head;
        while(head != null) {
            head = head.next;
            count++;
            if (count%2 == 0) { // next poistion for even time
                mid = mid.next;
            }
        }
        return mid;
    }
}