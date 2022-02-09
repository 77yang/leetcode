package com.yang7.sword2offer;


import java.util.HashSet;
import java.util.Set;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode cur = this;
        StringBuffer sb = new StringBuffer();
        Set<ListNode> set = new HashSet();
        while (cur != null) {
            //链表出现环装要避免死循环
            if (set.contains(cur)) {
                break;
            }
            set.add(cur);
            sb.append(cur.val+"->");
            cur = cur.next;
        }
        return sb.toString();
    }
}