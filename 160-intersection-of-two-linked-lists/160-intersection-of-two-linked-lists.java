/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // first approach: using hashset to identify common element
        /*
        if (headA == null && headB == null) {
            return null;
        }
        
        Set<ListNode> set = new HashSet<ListNode>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
        */
        
        //Traversal aproach:
        /*
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA!=nodeB) {
            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }
        return nodeA;
        */
        
        //Length based approach:
        int aSize = getLength(headA);
        int bSize = getLength(headB);
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        if (aSize > bSize) {
            for (int i=0;i<(aSize-bSize);i++) {
                nodeA = nodeA.next;
            }
        } else {
            for (int i=0;i<(bSize-aSize);i++) {
                nodeB = nodeB.next;
            }
        }
        
        while (nodeA!=nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }
    
    public int getLength(ListNode headA) {
        int i = 0;
        while (headA != null) {
            i++;
            headA = headA.next;
        }
        return i;
    }
}