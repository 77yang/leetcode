package com.yang7.sword2offer;


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
        while (cur != null) {
            sb.append(cur.val+"->");
            cur = cur.next;
        }
        return sb.toString();
    }
}