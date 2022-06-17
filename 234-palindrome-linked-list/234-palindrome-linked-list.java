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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode h = head;
        int s = 0;
        while (head != null) {
            s++;
            head = head.next;
        }
        int i = s % 2 == 1 ? -1 : 0;
        while (i < s / 2) {
            System.out.println(h.val);
            stack.push(Integer.valueOf(h.val));
            h = h.next;
            i++;
        }
        if (s % 2 == 1) {
            stack.pop();
        }
        while (i < s && !stack.isEmpty()) {
            System.out.println(Integer.valueOf(h.val));
            if (!stack.pop().equals(Integer.valueOf(h.val))) {
                return false;
            }
            h = h.next;
            i++;
        }
        return true;
    }
}