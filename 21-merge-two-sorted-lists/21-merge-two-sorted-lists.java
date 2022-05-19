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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null && l2 == null) {
            return null;
        }
        ListNode list = null;
        if (l1.val < l2.val) {
            list = new ListNode(l1.val, null);
            l1 = l1.next;
        } else {
            list = new ListNode(l2.val, null);
            l2 = l2.next;
        }
        ListNode head = list;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                list.next = new ListNode(l1.val, null);
                list = list.next;
                l1 = l1.next;
            } else {
                list.next = new ListNode(l2.val, null);
                list = list.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            list.next = new ListNode(l1.val, null);
            list = list.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            list.next = new ListNode(l2.val, null);
            list = list.next;
            l2 = l2.next;
        }
        return head;
    }
}