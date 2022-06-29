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
        Stack<Integer> s1 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> s2 = new Stack<>();
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int res = 0;
        ListNode head = new ListNode(0);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) {
                res += s1.pop();
            }
            if (!s2.isEmpty()) {
                res += s2.pop();
            }
            head.val = res % 10;
            ListNode temp = new ListNode(res / 10);
            temp.next = head;
            head = temp;
            res = res / 10;
        }
        return head.val == 0 ? head.next : head;
    }
}