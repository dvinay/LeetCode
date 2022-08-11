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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        ListNode head = new ListNode();
        ListNode results = head;
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                // add list1
                head.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                // add list2
                head.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            head = head.next;
        }
        if (list1 != null) {
            head.next = list1;
        }
        if (list2 != null) {
            head.next = list2;
        }
        return results.next;
    }
}