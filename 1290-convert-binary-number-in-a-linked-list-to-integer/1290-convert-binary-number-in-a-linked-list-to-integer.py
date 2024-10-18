# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        n, pos = 0, -1
        h = head
        while h:
            pos += 1
            h = h.next
        while head:
            n += (2 ** pos) * head.val
            pos -= 1
            head = head.next
        return n