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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = new ListNode(0);
        ListNode h = curr;
        ListNode t = curr;
        t.next = head;
        int i = 1;
        while (h != null && i <= n + 1) {
            h = h.next;
            i++;
        }
        while (h != null) {
            h = h.next;
            t = t.next;
        }
        t.next = t.next.next;
        return curr.next;
    }
}