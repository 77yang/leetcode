# https://leetcode.com/problems/merge-two-sorted-lists/


# Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
#
# Example:
#
# Input: 1->2->4, 1->3->4
# Output: 1->1->2->3->4->4


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def appendNode(l1, l2):
    if l1 is None:
        return l2
    if l2 is None:
        return l1
    if l1.val >= l2.val:
        l2.next = appendNode(l1, l2.next)
        return l2
    if l2.val > l1.val:
        l1.next = appendNode(l1.next, l2)
        return l1


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        return appendNode(l1, l2)


node1 = ListNode(1)
node2 = ListNode(2)

node1.next = node2
node3 = ListNode(4)
node2.next = node3

node4 = ListNode(1)
node5 = ListNode(3)
node4.next = node5

node6 = ListNode(4)
node5.next = node6

lists = Solution().mergeTwoLists(node1, node4)
while lists is not None:
    print(lists.val)
    lists = lists.next
