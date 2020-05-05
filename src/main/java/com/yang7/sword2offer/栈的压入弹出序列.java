package com.yang7.sword2offer;

import java.util.Stack;
/*
* 1.push condition:
*
*
* */

public class 栈的压入弹出序列 {
    static class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {

            Stack<Integer> stack = new Stack();
            int j =0;
            for (int i : pushed) {
                stack.push(i);
                while (!stack.isEmpty() && stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                }
            }

            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {4, 5, 3, 2, 1};
        System.out.println(new Solution().validateStackSequences(a1, a2));


        int[] a3 = {2, 1, 0};
        int[] a4 = {1, 2, 0};
        System.out.println(new Solution().validateStackSequences(a3, a4));


        int[] a5 = {1,2,3,4,5};
        int[] a6 = {4,3,5,1,2};
        System.out.println(new Solution().validateStackSequences(a5, a6));
    }
}
