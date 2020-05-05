package com.yang7.sword2offer;

import java.util.Stack;

public class 包含min函数的栈 {
    class MinStack {
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            stack1.push(x);

            if (stack2.isEmpty() || stack2.peek() >= x) {
                stack2.push(x);
            }
        }

        public void pop() {
            if (stack1.pop().equals(stack2.peek())) {
                stack2.pop();
            }
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return stack2.peek();
        }
    }
}
