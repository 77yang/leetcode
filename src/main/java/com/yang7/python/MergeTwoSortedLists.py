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


def appendNode(l1, l2, parent_node: ListNode):

    if l1 is None:
        return l2
    if l2 is None:
        return l1

    if l1 is None and l2 is None:
        parent_node.next = None
        return

    if l1 is None and l2 is not None:
        new_node = ListNode(l2.val)
        parent_node.next = new_node
        appendNode(l1, l2.next, new_node)
    elif l2 is None and l1 is not None:
        new_node = ListNode(l1.val)
        parent_node.next = new_node
        appendNode(l1.next, l2, new_node)
    elif l1 is not None and l2 is not None and l1.val >= l2.val:
        new_node = ListNode(l2.val)
        parent_node.next = new_node
        appendNode(l1, l2.next, new_node)
    elif l1 is not None and l2 is not None and l1.val < l2.val:
        new_node = ListNode(l1.val)
        parent_node.next = new_node
        appendNode(l1.next, l2, new_node)


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        root_node = ListNode(-1)
        appendNode(l1, l2, root_node)
        return root_node.next


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
