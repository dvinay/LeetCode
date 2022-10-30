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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        int sum = l1.val + l2.val;
        int carryForward = getCarryForward(sum);
        l1 = l1.next;
        l2 = l2.next;
        ListNode head = new ListNode(getSumDigit(sum));
        ListNode results = head;
        
        while(l1 != null && l2 != null) {
            sum = l1.val + l2.val + carryForward;
            carryForward = getCarryForward(sum);
            head.next = new ListNode(getSumDigit(sum));
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            sum = l1.val + carryForward;
            carryForward = getCarryForward(sum);
            head.next = new ListNode(getSumDigit(sum));
            head = head.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            sum = l2.val + carryForward;
            carryForward = getCarryForward(sum);
            head.next = new ListNode(getSumDigit(sum));
            head = head.next;
            l2 = l2.next;
        }
        if (carryForward != 0) {
            head.next = new ListNode(carryForward);
        }
        return results;
    }
    
    public int getCarryForward(int sum) {
        return sum >= 10 ? sum/10 : 0;
    }
    public int getSumDigit(int sum) {
        return sum >= 10 ? sum%10 : sum;
    }
}