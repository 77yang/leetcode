package com.yang7.sword2offer;

import java.util.Stack;

public class 用两个栈实现队列 {
    static class CQueue {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {


            if (stack1.isEmpty()) {
                return -1;
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            Integer value = stack2.pop();


            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return value;

        }
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);

        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }

}
