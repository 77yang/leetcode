package com.yang7;

import java.util.Stack;

public class 最小栈 {
    static class MinStack {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min = new Stack<>();

        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int x) {

            stack.push(x);
            if (min.isEmpty()) {
                min.push(x);
                return;
            }
            Integer peek = min.peek();

            if (x <= peek) {
                min.push(x);
            }


        }
        public void pop() {
            Integer pop = stack.pop();
            if (min.isEmpty()) {
                return;
            }
            Integer peek = min.peek();
            if (peek.equals(pop)) {
                min.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }

        public static void main(String[] args) {
            MinStack minStack = new MinStack();
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);
            minStack.getMin();
            minStack.pop();
            minStack.top();
            minStack.getMin();

        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
