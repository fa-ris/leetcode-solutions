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
        Map<ListNode, Integer> map = new HashMap<>();
        int i = 0;
        while (headA != null) {
            map.put(headA, i);
            headA = headA.next;
            i++;
        }
        Map<ListNode, Integer> map1 = new HashMap<>();
        i = 0;
        while (headB != null) {
            map1.put(headB, i);
            headB = headB.next;
            i++;
        }
        for (ListNode key : map.keySet()) {
            if (!map1.containsKey(key)) {
                map1.remove(key);
            }
        }
        i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        ListNode lN = null;
        for (ListNode key : map1.keySet()) {
            if (map.containsKey(key) && map.get(key).compareTo(Integer.valueOf(i)) < 0 
                && map1.get(key).compareTo(Integer.valueOf(j)) < 0) {
                lN = key;
                i = map.get(key);
                j = map1.get(key);
            }
        }
        return lN;
    }
}